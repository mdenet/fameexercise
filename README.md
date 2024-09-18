# FAME'24 MDE Hands-On Session

This repository has been set up for a hands-on session during the [1st International School on Foundations and Advances of Model-Based Engineering](https://fame-school.github.io/). The purpose of the session is to give you basic hands-on experience of some MDE tools and techniques.

## Getting started

You can see this repository, so you have already managed to get through the first step of the activity: to get hold of your own repository. Before you can take the next step, we need to take one more preparation step. This would normally run automatically, but due to a recent bug in Github Classroom, you will need to do a bit of work yourself:

1. Open [update-private-repo-link.yml](.github/workflows/update-private-repo-link.yml) and click on the edit button in the top right corner: ![pen icon](images/pen_icon.PNG).
2. Add a space at the top of the file, then remove that space again. This means the file remains unchanged, but you have now enabled the "Commit" button.
3. Click the "Commit" button to save the file into your repository. Accept the standard commit message and commit directly to `main`. This will trick Github into refreshing its caches and noticing the workflow defined in this file.
4. Got to the `Actions` tab, then click on `Update privaterepo in README` in the left-hand side menu. Run the workflow from the `Run workflow` dropdown on the right-hand side.
5. Return to the main page for the repository. Wait and refresh this page until you can see the message below. This indicates that Github has correctly modified this README file and that all links provided below have been customised for your personal use.
![Github message on successful preparation of the repository](images/readme_rewrite_success.PNG)

## Exercises

### Step 1: A simple domain-specific modelling language with Xtext

In this step, you will generate and explore a simple domain-specific modelling language (DSML) with a textual concrete syntax. You will use [Xtext](https://www.eclipse.org/Xtext/) to create the DSML. We will only use the most basic features of Xtext; it can do much more. Check out the [link](https://www.eclipse.org/Xtext/) to find out more.

> You can [do this activity in your browser](https://ep.mde-network.org/?activities=https://raw.githubusercontent.com/mdenet/fameexercise/main/basic_xtext_activity.json&privaterepo=true). Click on the link and your browser will open the MDENet Education Platform with the activity pre-loaded. You will be asked to sign in to Github; the first time you do this, you will be asked to give the MDENet Application access to your repository. You must do this to complete the activity. The application will only have access to this repository.

#### Exploration

After clicking on the link above (open it in a new tab so you can continue to view these instructions), you will see two panels in your browser. The upper panel contains the grammar of the DSML that we will be developing. This grammar consists of rules; each rule describes the concrete syntax of a bit of the language, starting from the top. Have a look over the grammar and see what of it you can understand -- don't worry too much if you cannot understand everything. A good introduction to the Xtext grammar language can be found [here](https://eclipse.dev/Xtext/documentation/102_domainmodelwalkthrough.html).

For now, you will not make changes to this grammar. Instead, click on the little green "run" button in the top right corner and wait for a bit. When you do this, Xtext runs in the background and generates a lot of code from your grammar. This code implements a full IDE for your language.

Once the generation process has finished (a little "Success" popup will appear in the top-right corner of the screen), you will be able to test out the language. For this, click on the link labelled "Try out your language" that has appeared in the left-hand side menu.

This will open a new view (you will be asked again to "sign in with Github"): the left panel is the editor for your new language, the right panel allows us to visualise the internal representation of the language and your model.

First, click on the little diagram button at the top of the *right* panel. This shows a class diagram -- explore it a bit. This is the "meta-model" of your language, sometimes also called the "abstract syntax". It shows the set of classes that Xtext instantiates every time it parses text in your new modelling language. Compare this back to your grammar (you can open a separate copy of the education platform in a separate tab) and see how Xtext has generated classes and attributes from the rules in the grammar. 

> *Discussion task:* spend 5 minutes exploring this a bit and try to extract the rules that Xtext used to generate a meta-model from your grammar. Then, we will discuss this as a group.

Next, look more closely at the left panel. This already contains some text in your new language. Notice the syntax highlighting automatically provided, make some changes, and see how the editor highlights if you are making an error. You can also use `Ctrl+Space` to invoke the auto-completion service. Try this inside an effort statement (indicating who does which work at which percentage of their time) in the place where you have to provide the name of a person. Note how the editor offers you a list of all the names you have previously defined in the model.

> *Discussion task:* Look back at the grammar. Can you spot how Xtext knows to do this? Note down your answer, then we will discuss as a group.

Finally, click on the diagram button at the top of the *left* panel. This replaces the contents of the right panel with an object diagram, showing how the classes from the meta-model have been instantiated for your concrete model. Make some changes to the text on the left and regenerate the diagram to explore how the text is translated into a structure of objects. It's these objects that are used whenever we do anything with a model. For example, we will use them in the next step to translate our model into a different model. 

Watch out for the different shape of the arrows between `Project` and `Task` and between `Effort` and `Person`, respectively. The former is called a "containment" reference. The rule is that every object in a model must be part of a tree of containment references and that there must be a unique root element for this tree; in our case this is the instance of `Project`.

#### Make a change

Go back to the first view (you can use the "Define your language" link in the left-hand menu) to see the grammar again. You will now make a change to the grammar.

We want to capture different types of people working on projects: some are regular "Workers" and some are "Bosses". To do this, you will add two new rules and rename one existing one:

1. Rename the existing `Person` rule to `Worker`. This syntax will now capture how regular workers are described.
2. Create a new rule `Boss`. You can place it anywhere in the grammar file, as long as it doesn't come before the initial `Project` rule. It's good practice to put it in a sensible place -- for example, next to your `Worker` rule. The contents of your rule should be
``
Boss:
  'boss' name=ID leads+=[Person] (',' 'and' leads+=[Person])*
;
``
In other words, a boss is someone who leads other people.
3. Add a new rule 
``
Person:
  Boss | Worker
;
``
stating that a person is either a boss or a worker.

Click on the run button and wait until Xtext has successfully generated your new editor. If you get an error message, check if you have done everything correctly.

> **Before** opening the generated editor, click on "Save". The education platform will add a commit to your repository with the changes you have made, so that you can work with them the next time you come back to the exercise. Only do this once you have successfully generated the editor to avoid committing incorrect code to your repository.

Explore your new language, checking out the meta-model, object diagram of models, and code completion options. Can you see how Xtext has implemented the new `Person` rule in the meta-model?

> *Discussion task:* Spend 5 minutes exploring and discussing your observations with your neighbour. We will then discuss as a group.

#### Where next

> *Extension task.* If you want to explore more beyond the contents of today's session, try making some more changes to the grammar. Can you add support for the salary a person gets per hour? Can you make it so that the salary is stored as a float number in the meta-model? Remember to click on "Save" before opening the generated editor.

### Step 2: Let's transform our models

In this activity, you will take a model in your DSML and transform it into a different model. This is an important activity in MDE. It allows us to analyse and enrich models so that they can be used to automate a broad variety of activities in software development. Because we have limited time, we will experiment with a very simple transformation: we will generate a model listing the deliverables implied by a given project plan. We will also generate a list of authors for each deliverable.

> You can [do this activity in your browser](https://ep.mde-network.org/?activities=https://raw.githubusercontent.com/mdenet/fameexercise/main/etl_activity.json&privaterepo=true). Click on the link and your browser will open the MDENet Education Platform with the activity pre-loaded. You will be asked to sign in to Github.

#### Exploration

Again, you first see the Xtext grammar. Click the run button to generate the editor and IDE for your language. Open the generated IDE once the generation has completed successfully.

We now have more panels to explore. We still have the editor for our models in the top-left corner. In the top-right corner, we still have the diagram panel that can show us the meta-model for our language or the object-diagram for our current model as before. Below this, we have four panels for building our transformation:

1. The middle left panel is where you will write your transformation code using the [Epsilon Transformation Language (ETL)](https://eclipse.dev/epsilon/doc/etl/). It already contains a basic transformation. Thank you to the Epsilon team, who have written this transformation as part of their library of examples.
2. Once the transformation has been run, you will be able to see an object diagram of the model your transformation has produced in the middle right panel, if the transformation has been successful.
3. The lower left panel is a console view, which will show output from the running transformation, if any. This will show error messages, but you can also send text there by including print statements in your code. Try adding `"Hello World".println();` just above the line that reads `t.title = s.title;` and run the ETL script to see how this works.
4. In the bottom right corner, you can see the definition of the meta-model of the language in which your output model will be produced. This tells you what classes, attributes, and relationships you need to fill out.

Click on the green run button in the ETL panel and see what happens. Compare the object diagram of your model with the object diagram of the transformation result. Follow the ETL description to understand how this is produced.

> *Discussion task:* Spend 5 minutes exploring the result of running the transformation and compare it to the transformation script. Note down your observations; you can also discuss these with your neighbour. We will then discuss as a group and try to make sense of the ETL script.

#### Make a change

Next, try to change the ETL script so that in addition to producing a `Deliverable` object for each `Task`, it fills in the `authors` attribute of the newly created `Deliverable` with a list of the persons working on the task sorted by the percentage of their time they have been working on the task. You can use the `concat(separator : String) : String` operation on the sequence of efforts to turn it into a suitable string.

> *Discussion task:* Work with your neighbour for 10 minutes on this. Then, we will discuss as a group.

#### Where next?

> *Extension task.* If you want to explore more beyond the contents of today's session, try extending the transformation to compute the cost of each deliverable based on the salary and percentage of the people contributing to it. You will need to first extend the deliverables meta-model with an extra attribute to contain the cost information.

## Thank you

Many people have helped create the platform and tools for this exercise. I would like to thank:

- Will Barnett, who built the [MDENet Education Platform](https://ep.mde-network.org) building on the [Epsilon Playground](https://eclipse.dev/epsilon/playground/).
- Antonio Garcia-Dominguez, who came up with the Github workflow for rewriting links in README files that makes it easy to run the activities directly from a repository.
- Dimitris Kolovos, Antonio Garcia-Dominguez, and Artur Boronat, who contributed loads of ideas and suggestions as part of the community steering board for the education platform.
- The [UK Engineering and Physical Sciences Research Council (EPSRC)](http://www.epsrc.ac.uk/), who funded the [MDENet network project](https://www.mde-network.org) and the development of the [MDENet Education Platform](https://ep.mde-network.org).