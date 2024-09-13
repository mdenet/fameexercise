package uk.ac.kcl.inf.fame.projects.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.fame.projects.services.ProjectsLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectsLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'described'", "'as'", "'task'", "'from'", "'month'", "'for'", "'months'", "'involves'", "'and'", "'person'", "'works'", "'%'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProjectsLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProjectsLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProjectsLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProjectsLang.g"; }


    	private ProjectsLangGrammarAccess grammarAccess;

    	public void setGrammarAccess(ProjectsLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProject"
    // InternalProjectsLang.g:53:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalProjectsLang.g:54:1: ( ruleProject EOF )
            // InternalProjectsLang.g:55:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalProjectsLang.g:62:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:66:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalProjectsLang.g:67:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalProjectsLang.g:67:2: ( ( rule__Project__Group__0 ) )
            // InternalProjectsLang.g:68:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalProjectsLang.g:69:3: ( rule__Project__Group__0 )
            // InternalProjectsLang.g:69:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTask"
    // InternalProjectsLang.g:78:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalProjectsLang.g:79:1: ( ruleTask EOF )
            // InternalProjectsLang.g:80:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalProjectsLang.g:87:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:91:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalProjectsLang.g:92:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalProjectsLang.g:92:2: ( ( rule__Task__Group__0 ) )
            // InternalProjectsLang.g:93:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalProjectsLang.g:94:3: ( rule__Task__Group__0 )
            // InternalProjectsLang.g:94:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRulePerson"
    // InternalProjectsLang.g:103:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalProjectsLang.g:104:1: ( rulePerson EOF )
            // InternalProjectsLang.g:105:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalProjectsLang.g:112:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:116:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalProjectsLang.g:117:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalProjectsLang.g:117:2: ( ( rule__Person__Group__0 ) )
            // InternalProjectsLang.g:118:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalProjectsLang.g:119:3: ( rule__Person__Group__0 )
            // InternalProjectsLang.g:119:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEffort"
    // InternalProjectsLang.g:128:1: entryRuleEffort : ruleEffort EOF ;
    public final void entryRuleEffort() throws RecognitionException {
        try {
            // InternalProjectsLang.g:129:1: ( ruleEffort EOF )
            // InternalProjectsLang.g:130:1: ruleEffort EOF
            {
             before(grammarAccess.getEffortRule()); 
            pushFollow(FOLLOW_1);
            ruleEffort();

            state._fsp--;

             after(grammarAccess.getEffortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEffort"


    // $ANTLR start "ruleEffort"
    // InternalProjectsLang.g:137:1: ruleEffort : ( ( rule__Effort__Group__0 ) ) ;
    public final void ruleEffort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:141:2: ( ( ( rule__Effort__Group__0 ) ) )
            // InternalProjectsLang.g:142:2: ( ( rule__Effort__Group__0 ) )
            {
            // InternalProjectsLang.g:142:2: ( ( rule__Effort__Group__0 ) )
            // InternalProjectsLang.g:143:3: ( rule__Effort__Group__0 )
            {
             before(grammarAccess.getEffortAccess().getGroup()); 
            // InternalProjectsLang.g:144:3: ( rule__Effort__Group__0 )
            // InternalProjectsLang.g:144:4: rule__Effort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffort"


    // $ANTLR start "rule__Project__Alternatives_5"
    // InternalProjectsLang.g:152:1: rule__Project__Alternatives_5 : ( ( ( rule__Project__TasksAssignment_5_0 ) ) | ( ( rule__Project__PeopleAssignment_5_1 ) ) );
    public final void rule__Project__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:156:1: ( ( ( rule__Project__TasksAssignment_5_0 ) ) | ( ( rule__Project__PeopleAssignment_5_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalProjectsLang.g:157:2: ( ( rule__Project__TasksAssignment_5_0 ) )
                    {
                    // InternalProjectsLang.g:157:2: ( ( rule__Project__TasksAssignment_5_0 ) )
                    // InternalProjectsLang.g:158:3: ( rule__Project__TasksAssignment_5_0 )
                    {
                     before(grammarAccess.getProjectAccess().getTasksAssignment_5_0()); 
                    // InternalProjectsLang.g:159:3: ( rule__Project__TasksAssignment_5_0 )
                    // InternalProjectsLang.g:159:4: rule__Project__TasksAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__TasksAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectAccess().getTasksAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectsLang.g:163:2: ( ( rule__Project__PeopleAssignment_5_1 ) )
                    {
                    // InternalProjectsLang.g:163:2: ( ( rule__Project__PeopleAssignment_5_1 ) )
                    // InternalProjectsLang.g:164:3: ( rule__Project__PeopleAssignment_5_1 )
                    {
                     before(grammarAccess.getProjectAccess().getPeopleAssignment_5_1()); 
                    // InternalProjectsLang.g:165:3: ( rule__Project__PeopleAssignment_5_1 )
                    // InternalProjectsLang.g:165:4: rule__Project__PeopleAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__PeopleAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProjectAccess().getPeopleAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Alternatives_5"


    // $ANTLR start "rule__Project__Group__0"
    // InternalProjectsLang.g:173:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:177:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalProjectsLang.g:178:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalProjectsLang.g:185:1: rule__Project__Group__0__Impl : ( 'project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:189:1: ( ( 'project' ) )
            // InternalProjectsLang.g:190:1: ( 'project' )
            {
            // InternalProjectsLang.g:190:1: ( 'project' )
            // InternalProjectsLang.g:191:2: 'project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalProjectsLang.g:200:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:204:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalProjectsLang.g:205:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalProjectsLang.g:212:1: rule__Project__Group__1__Impl : ( ( rule__Project__TitleAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:216:1: ( ( ( rule__Project__TitleAssignment_1 ) ) )
            // InternalProjectsLang.g:217:1: ( ( rule__Project__TitleAssignment_1 ) )
            {
            // InternalProjectsLang.g:217:1: ( ( rule__Project__TitleAssignment_1 ) )
            // InternalProjectsLang.g:218:2: ( rule__Project__TitleAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getTitleAssignment_1()); 
            // InternalProjectsLang.g:219:2: ( rule__Project__TitleAssignment_1 )
            // InternalProjectsLang.g:219:3: rule__Project__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalProjectsLang.g:227:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:231:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalProjectsLang.g:232:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalProjectsLang.g:239:1: rule__Project__Group__2__Impl : ( 'described' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:243:1: ( ( 'described' ) )
            // InternalProjectsLang.g:244:1: ( 'described' )
            {
            // InternalProjectsLang.g:244:1: ( 'described' )
            // InternalProjectsLang.g:245:2: 'described'
            {
             before(grammarAccess.getProjectAccess().getDescribedKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getDescribedKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalProjectsLang.g:254:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:258:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalProjectsLang.g:259:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalProjectsLang.g:266:1: rule__Project__Group__3__Impl : ( 'as' ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:270:1: ( ( 'as' ) )
            // InternalProjectsLang.g:271:1: ( 'as' )
            {
            // InternalProjectsLang.g:271:1: ( 'as' )
            // InternalProjectsLang.g:272:2: 'as'
            {
             before(grammarAccess.getProjectAccess().getAsKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalProjectsLang.g:281:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:285:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalProjectsLang.g:286:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalProjectsLang.g:293:1: rule__Project__Group__4__Impl : ( ( rule__Project__DescriptionAssignment_4 ) ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:297:1: ( ( ( rule__Project__DescriptionAssignment_4 ) ) )
            // InternalProjectsLang.g:298:1: ( ( rule__Project__DescriptionAssignment_4 ) )
            {
            // InternalProjectsLang.g:298:1: ( ( rule__Project__DescriptionAssignment_4 ) )
            // InternalProjectsLang.g:299:2: ( rule__Project__DescriptionAssignment_4 )
            {
             before(grammarAccess.getProjectAccess().getDescriptionAssignment_4()); 
            // InternalProjectsLang.g:300:2: ( rule__Project__DescriptionAssignment_4 )
            // InternalProjectsLang.g:300:3: rule__Project__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Project__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalProjectsLang.g:308:1: rule__Project__Group__5 : rule__Project__Group__5__Impl ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:312:1: ( rule__Project__Group__5__Impl )
            // InternalProjectsLang.g:313:2: rule__Project__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalProjectsLang.g:319:1: rule__Project__Group__5__Impl : ( ( rule__Project__Alternatives_5 )* ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:323:1: ( ( ( rule__Project__Alternatives_5 )* ) )
            // InternalProjectsLang.g:324:1: ( ( rule__Project__Alternatives_5 )* )
            {
            // InternalProjectsLang.g:324:1: ( ( rule__Project__Alternatives_5 )* )
            // InternalProjectsLang.g:325:2: ( rule__Project__Alternatives_5 )*
            {
             before(grammarAccess.getProjectAccess().getAlternatives_5()); 
            // InternalProjectsLang.g:326:2: ( rule__Project__Alternatives_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProjectsLang.g:326:3: rule__Project__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Project__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalProjectsLang.g:335:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:339:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalProjectsLang.g:340:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalProjectsLang.g:347:1: rule__Task__Group__0__Impl : ( 'task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:351:1: ( ( 'task' ) )
            // InternalProjectsLang.g:352:1: ( 'task' )
            {
            // InternalProjectsLang.g:352:1: ( 'task' )
            // InternalProjectsLang.g:353:2: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalProjectsLang.g:362:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:366:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalProjectsLang.g:367:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalProjectsLang.g:374:1: rule__Task__Group__1__Impl : ( ( rule__Task__TitleAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:378:1: ( ( ( rule__Task__TitleAssignment_1 ) ) )
            // InternalProjectsLang.g:379:1: ( ( rule__Task__TitleAssignment_1 ) )
            {
            // InternalProjectsLang.g:379:1: ( ( rule__Task__TitleAssignment_1 ) )
            // InternalProjectsLang.g:380:2: ( rule__Task__TitleAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getTitleAssignment_1()); 
            // InternalProjectsLang.g:381:2: ( rule__Task__TitleAssignment_1 )
            // InternalProjectsLang.g:381:3: rule__Task__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalProjectsLang.g:389:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:393:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalProjectsLang.g:394:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalProjectsLang.g:401:1: rule__Task__Group__2__Impl : ( 'from' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:405:1: ( ( 'from' ) )
            // InternalProjectsLang.g:406:1: ( 'from' )
            {
            // InternalProjectsLang.g:406:1: ( 'from' )
            // InternalProjectsLang.g:407:2: 'from'
            {
             before(grammarAccess.getTaskAccess().getFromKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalProjectsLang.g:416:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:420:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalProjectsLang.g:421:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalProjectsLang.g:428:1: rule__Task__Group__3__Impl : ( 'month' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:432:1: ( ( 'month' ) )
            // InternalProjectsLang.g:433:1: ( 'month' )
            {
            // InternalProjectsLang.g:433:1: ( 'month' )
            // InternalProjectsLang.g:434:2: 'month'
            {
             before(grammarAccess.getTaskAccess().getMonthKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getMonthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalProjectsLang.g:443:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:447:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalProjectsLang.g:448:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalProjectsLang.g:455:1: rule__Task__Group__4__Impl : ( ( rule__Task__StartAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:459:1: ( ( ( rule__Task__StartAssignment_4 ) ) )
            // InternalProjectsLang.g:460:1: ( ( rule__Task__StartAssignment_4 ) )
            {
            // InternalProjectsLang.g:460:1: ( ( rule__Task__StartAssignment_4 ) )
            // InternalProjectsLang.g:461:2: ( rule__Task__StartAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getStartAssignment_4()); 
            // InternalProjectsLang.g:462:2: ( rule__Task__StartAssignment_4 )
            // InternalProjectsLang.g:462:3: rule__Task__StartAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Task__StartAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getStartAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalProjectsLang.g:470:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:474:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalProjectsLang.g:475:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalProjectsLang.g:482:1: rule__Task__Group__5__Impl : ( 'for' ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:486:1: ( ( 'for' ) )
            // InternalProjectsLang.g:487:1: ( 'for' )
            {
            // InternalProjectsLang.g:487:1: ( 'for' )
            // InternalProjectsLang.g:488:2: 'for'
            {
             before(grammarAccess.getTaskAccess().getForKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getForKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalProjectsLang.g:497:1: rule__Task__Group__6 : rule__Task__Group__6__Impl rule__Task__Group__7 ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:501:1: ( rule__Task__Group__6__Impl rule__Task__Group__7 )
            // InternalProjectsLang.g:502:2: rule__Task__Group__6__Impl rule__Task__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalProjectsLang.g:509:1: rule__Task__Group__6__Impl : ( ( rule__Task__DurationAssignment_6 ) ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:513:1: ( ( ( rule__Task__DurationAssignment_6 ) ) )
            // InternalProjectsLang.g:514:1: ( ( rule__Task__DurationAssignment_6 ) )
            {
            // InternalProjectsLang.g:514:1: ( ( rule__Task__DurationAssignment_6 ) )
            // InternalProjectsLang.g:515:2: ( rule__Task__DurationAssignment_6 )
            {
             before(grammarAccess.getTaskAccess().getDurationAssignment_6()); 
            // InternalProjectsLang.g:516:2: ( rule__Task__DurationAssignment_6 )
            // InternalProjectsLang.g:516:3: rule__Task__DurationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Task__DurationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDurationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__7"
    // InternalProjectsLang.g:524:1: rule__Task__Group__7 : rule__Task__Group__7__Impl rule__Task__Group__8 ;
    public final void rule__Task__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:528:1: ( rule__Task__Group__7__Impl rule__Task__Group__8 )
            // InternalProjectsLang.g:529:2: rule__Task__Group__7__Impl rule__Task__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7"


    // $ANTLR start "rule__Task__Group__7__Impl"
    // InternalProjectsLang.g:536:1: rule__Task__Group__7__Impl : ( 'months' ) ;
    public final void rule__Task__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:540:1: ( ( 'months' ) )
            // InternalProjectsLang.g:541:1: ( 'months' )
            {
            // InternalProjectsLang.g:541:1: ( 'months' )
            // InternalProjectsLang.g:542:2: 'months'
            {
             before(grammarAccess.getTaskAccess().getMonthsKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getMonthsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__7__Impl"


    // $ANTLR start "rule__Task__Group__8"
    // InternalProjectsLang.g:551:1: rule__Task__Group__8 : rule__Task__Group__8__Impl rule__Task__Group__9 ;
    public final void rule__Task__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:555:1: ( rule__Task__Group__8__Impl rule__Task__Group__9 )
            // InternalProjectsLang.g:556:2: rule__Task__Group__8__Impl rule__Task__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Task__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8"


    // $ANTLR start "rule__Task__Group__8__Impl"
    // InternalProjectsLang.g:563:1: rule__Task__Group__8__Impl : ( 'involves' ) ;
    public final void rule__Task__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:567:1: ( ( 'involves' ) )
            // InternalProjectsLang.g:568:1: ( 'involves' )
            {
            // InternalProjectsLang.g:568:1: ( 'involves' )
            // InternalProjectsLang.g:569:2: 'involves'
            {
             before(grammarAccess.getTaskAccess().getInvolvesKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getInvolvesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__8__Impl"


    // $ANTLR start "rule__Task__Group__9"
    // InternalProjectsLang.g:578:1: rule__Task__Group__9 : rule__Task__Group__9__Impl rule__Task__Group__10 ;
    public final void rule__Task__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:582:1: ( rule__Task__Group__9__Impl rule__Task__Group__10 )
            // InternalProjectsLang.g:583:2: rule__Task__Group__9__Impl rule__Task__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Task__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9"


    // $ANTLR start "rule__Task__Group__9__Impl"
    // InternalProjectsLang.g:590:1: rule__Task__Group__9__Impl : ( ( rule__Task__EffortAssignment_9 ) ) ;
    public final void rule__Task__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:594:1: ( ( ( rule__Task__EffortAssignment_9 ) ) )
            // InternalProjectsLang.g:595:1: ( ( rule__Task__EffortAssignment_9 ) )
            {
            // InternalProjectsLang.g:595:1: ( ( rule__Task__EffortAssignment_9 ) )
            // InternalProjectsLang.g:596:2: ( rule__Task__EffortAssignment_9 )
            {
             before(grammarAccess.getTaskAccess().getEffortAssignment_9()); 
            // InternalProjectsLang.g:597:2: ( rule__Task__EffortAssignment_9 )
            // InternalProjectsLang.g:597:3: rule__Task__EffortAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Task__EffortAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getEffortAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__9__Impl"


    // $ANTLR start "rule__Task__Group__10"
    // InternalProjectsLang.g:605:1: rule__Task__Group__10 : rule__Task__Group__10__Impl ;
    public final void rule__Task__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:609:1: ( rule__Task__Group__10__Impl )
            // InternalProjectsLang.g:610:2: rule__Task__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10"


    // $ANTLR start "rule__Task__Group__10__Impl"
    // InternalProjectsLang.g:616:1: rule__Task__Group__10__Impl : ( ( rule__Task__Group_10__0 )* ) ;
    public final void rule__Task__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:620:1: ( ( ( rule__Task__Group_10__0 )* ) )
            // InternalProjectsLang.g:621:1: ( ( rule__Task__Group_10__0 )* )
            {
            // InternalProjectsLang.g:621:1: ( ( rule__Task__Group_10__0 )* )
            // InternalProjectsLang.g:622:2: ( rule__Task__Group_10__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_10()); 
            // InternalProjectsLang.g:623:2: ( rule__Task__Group_10__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalProjectsLang.g:623:3: rule__Task__Group_10__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Task__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__10__Impl"


    // $ANTLR start "rule__Task__Group_10__0"
    // InternalProjectsLang.g:632:1: rule__Task__Group_10__0 : rule__Task__Group_10__0__Impl rule__Task__Group_10__1 ;
    public final void rule__Task__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:636:1: ( rule__Task__Group_10__0__Impl rule__Task__Group_10__1 )
            // InternalProjectsLang.g:637:2: rule__Task__Group_10__0__Impl rule__Task__Group_10__1
            {
            pushFollow(FOLLOW_14);
            rule__Task__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_10__0"


    // $ANTLR start "rule__Task__Group_10__0__Impl"
    // InternalProjectsLang.g:644:1: rule__Task__Group_10__0__Impl : ( 'and' ) ;
    public final void rule__Task__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:648:1: ( ( 'and' ) )
            // InternalProjectsLang.g:649:1: ( 'and' )
            {
            // InternalProjectsLang.g:649:1: ( 'and' )
            // InternalProjectsLang.g:650:2: 'and'
            {
             before(grammarAccess.getTaskAccess().getAndKeyword_10_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getAndKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_10__0__Impl"


    // $ANTLR start "rule__Task__Group_10__1"
    // InternalProjectsLang.g:659:1: rule__Task__Group_10__1 : rule__Task__Group_10__1__Impl ;
    public final void rule__Task__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:663:1: ( rule__Task__Group_10__1__Impl )
            // InternalProjectsLang.g:664:2: rule__Task__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_10__1"


    // $ANTLR start "rule__Task__Group_10__1__Impl"
    // InternalProjectsLang.g:670:1: rule__Task__Group_10__1__Impl : ( ( rule__Task__EffortAssignment_10_1 ) ) ;
    public final void rule__Task__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:674:1: ( ( ( rule__Task__EffortAssignment_10_1 ) ) )
            // InternalProjectsLang.g:675:1: ( ( rule__Task__EffortAssignment_10_1 ) )
            {
            // InternalProjectsLang.g:675:1: ( ( rule__Task__EffortAssignment_10_1 ) )
            // InternalProjectsLang.g:676:2: ( rule__Task__EffortAssignment_10_1 )
            {
             before(grammarAccess.getTaskAccess().getEffortAssignment_10_1()); 
            // InternalProjectsLang.g:677:2: ( rule__Task__EffortAssignment_10_1 )
            // InternalProjectsLang.g:677:3: rule__Task__EffortAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__EffortAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getEffortAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_10__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalProjectsLang.g:686:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:690:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalProjectsLang.g:691:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalProjectsLang.g:698:1: rule__Person__Group__0__Impl : ( 'person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:702:1: ( ( 'person' ) )
            // InternalProjectsLang.g:703:1: ( 'person' )
            {
            // InternalProjectsLang.g:703:1: ( 'person' )
            // InternalProjectsLang.g:704:2: 'person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalProjectsLang.g:713:1: rule__Person__Group__1 : rule__Person__Group__1__Impl ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:717:1: ( rule__Person__Group__1__Impl )
            // InternalProjectsLang.g:718:2: rule__Person__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalProjectsLang.g:724:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:728:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalProjectsLang.g:729:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalProjectsLang.g:729:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalProjectsLang.g:730:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalProjectsLang.g:731:2: ( rule__Person__NameAssignment_1 )
            // InternalProjectsLang.g:731:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Effort__Group__0"
    // InternalProjectsLang.g:740:1: rule__Effort__Group__0 : rule__Effort__Group__0__Impl rule__Effort__Group__1 ;
    public final void rule__Effort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:744:1: ( rule__Effort__Group__0__Impl rule__Effort__Group__1 )
            // InternalProjectsLang.g:745:2: rule__Effort__Group__0__Impl rule__Effort__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Effort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__0"


    // $ANTLR start "rule__Effort__Group__0__Impl"
    // InternalProjectsLang.g:752:1: rule__Effort__Group__0__Impl : ( ( rule__Effort__PersonAssignment_0 ) ) ;
    public final void rule__Effort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:756:1: ( ( ( rule__Effort__PersonAssignment_0 ) ) )
            // InternalProjectsLang.g:757:1: ( ( rule__Effort__PersonAssignment_0 ) )
            {
            // InternalProjectsLang.g:757:1: ( ( rule__Effort__PersonAssignment_0 ) )
            // InternalProjectsLang.g:758:2: ( rule__Effort__PersonAssignment_0 )
            {
             before(grammarAccess.getEffortAccess().getPersonAssignment_0()); 
            // InternalProjectsLang.g:759:2: ( rule__Effort__PersonAssignment_0 )
            // InternalProjectsLang.g:759:3: rule__Effort__PersonAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Effort__PersonAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEffortAccess().getPersonAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__0__Impl"


    // $ANTLR start "rule__Effort__Group__1"
    // InternalProjectsLang.g:767:1: rule__Effort__Group__1 : rule__Effort__Group__1__Impl rule__Effort__Group__2 ;
    public final void rule__Effort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:771:1: ( rule__Effort__Group__1__Impl rule__Effort__Group__2 )
            // InternalProjectsLang.g:772:2: rule__Effort__Group__1__Impl rule__Effort__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Effort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__1"


    // $ANTLR start "rule__Effort__Group__1__Impl"
    // InternalProjectsLang.g:779:1: rule__Effort__Group__1__Impl : ( 'works' ) ;
    public final void rule__Effort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:783:1: ( ( 'works' ) )
            // InternalProjectsLang.g:784:1: ( 'works' )
            {
            // InternalProjectsLang.g:784:1: ( 'works' )
            // InternalProjectsLang.g:785:2: 'works'
            {
             before(grammarAccess.getEffortAccess().getWorksKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEffortAccess().getWorksKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__1__Impl"


    // $ANTLR start "rule__Effort__Group__2"
    // InternalProjectsLang.g:794:1: rule__Effort__Group__2 : rule__Effort__Group__2__Impl rule__Effort__Group__3 ;
    public final void rule__Effort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:798:1: ( rule__Effort__Group__2__Impl rule__Effort__Group__3 )
            // InternalProjectsLang.g:799:2: rule__Effort__Group__2__Impl rule__Effort__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Effort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__2"


    // $ANTLR start "rule__Effort__Group__2__Impl"
    // InternalProjectsLang.g:806:1: rule__Effort__Group__2__Impl : ( 'for' ) ;
    public final void rule__Effort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:810:1: ( ( 'for' ) )
            // InternalProjectsLang.g:811:1: ( 'for' )
            {
            // InternalProjectsLang.g:811:1: ( 'for' )
            // InternalProjectsLang.g:812:2: 'for'
            {
             before(grammarAccess.getEffortAccess().getForKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEffortAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__2__Impl"


    // $ANTLR start "rule__Effort__Group__3"
    // InternalProjectsLang.g:821:1: rule__Effort__Group__3 : rule__Effort__Group__3__Impl rule__Effort__Group__4 ;
    public final void rule__Effort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:825:1: ( rule__Effort__Group__3__Impl rule__Effort__Group__4 )
            // InternalProjectsLang.g:826:2: rule__Effort__Group__3__Impl rule__Effort__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Effort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__3"


    // $ANTLR start "rule__Effort__Group__3__Impl"
    // InternalProjectsLang.g:833:1: rule__Effort__Group__3__Impl : ( ( rule__Effort__PercentageAssignment_3 ) ) ;
    public final void rule__Effort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:837:1: ( ( ( rule__Effort__PercentageAssignment_3 ) ) )
            // InternalProjectsLang.g:838:1: ( ( rule__Effort__PercentageAssignment_3 ) )
            {
            // InternalProjectsLang.g:838:1: ( ( rule__Effort__PercentageAssignment_3 ) )
            // InternalProjectsLang.g:839:2: ( rule__Effort__PercentageAssignment_3 )
            {
             before(grammarAccess.getEffortAccess().getPercentageAssignment_3()); 
            // InternalProjectsLang.g:840:2: ( rule__Effort__PercentageAssignment_3 )
            // InternalProjectsLang.g:840:3: rule__Effort__PercentageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Effort__PercentageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEffortAccess().getPercentageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__3__Impl"


    // $ANTLR start "rule__Effort__Group__4"
    // InternalProjectsLang.g:848:1: rule__Effort__Group__4 : rule__Effort__Group__4__Impl ;
    public final void rule__Effort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:852:1: ( rule__Effort__Group__4__Impl )
            // InternalProjectsLang.g:853:2: rule__Effort__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effort__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__4"


    // $ANTLR start "rule__Effort__Group__4__Impl"
    // InternalProjectsLang.g:859:1: rule__Effort__Group__4__Impl : ( '%' ) ;
    public final void rule__Effort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:863:1: ( ( '%' ) )
            // InternalProjectsLang.g:864:1: ( '%' )
            {
            // InternalProjectsLang.g:864:1: ( '%' )
            // InternalProjectsLang.g:865:2: '%'
            {
             before(grammarAccess.getEffortAccess().getPercentSignKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEffortAccess().getPercentSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__Group__4__Impl"


    // $ANTLR start "rule__Project__TitleAssignment_1"
    // InternalProjectsLang.g:875:1: rule__Project__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Project__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:879:1: ( ( RULE_STRING ) )
            // InternalProjectsLang.g:880:2: ( RULE_STRING )
            {
            // InternalProjectsLang.g:880:2: ( RULE_STRING )
            // InternalProjectsLang.g:881:3: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TitleAssignment_1"


    // $ANTLR start "rule__Project__DescriptionAssignment_4"
    // InternalProjectsLang.g:890:1: rule__Project__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Project__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:894:1: ( ( RULE_STRING ) )
            // InternalProjectsLang.g:895:2: ( RULE_STRING )
            {
            // InternalProjectsLang.g:895:2: ( RULE_STRING )
            // InternalProjectsLang.g:896:3: RULE_STRING
            {
             before(grammarAccess.getProjectAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__DescriptionAssignment_4"


    // $ANTLR start "rule__Project__TasksAssignment_5_0"
    // InternalProjectsLang.g:905:1: rule__Project__TasksAssignment_5_0 : ( ruleTask ) ;
    public final void rule__Project__TasksAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:909:1: ( ( ruleTask ) )
            // InternalProjectsLang.g:910:2: ( ruleTask )
            {
            // InternalProjectsLang.g:910:2: ( ruleTask )
            // InternalProjectsLang.g:911:3: ruleTask
            {
             before(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TasksAssignment_5_0"


    // $ANTLR start "rule__Project__PeopleAssignment_5_1"
    // InternalProjectsLang.g:920:1: rule__Project__PeopleAssignment_5_1 : ( rulePerson ) ;
    public final void rule__Project__PeopleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:924:1: ( ( rulePerson ) )
            // InternalProjectsLang.g:925:2: ( rulePerson )
            {
            // InternalProjectsLang.g:925:2: ( rulePerson )
            // InternalProjectsLang.g:926:3: rulePerson
            {
             before(grammarAccess.getProjectAccess().getPeoplePersonParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getPeoplePersonParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__PeopleAssignment_5_1"


    // $ANTLR start "rule__Task__TitleAssignment_1"
    // InternalProjectsLang.g:935:1: rule__Task__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Task__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:939:1: ( ( RULE_STRING ) )
            // InternalProjectsLang.g:940:2: ( RULE_STRING )
            {
            // InternalProjectsLang.g:940:2: ( RULE_STRING )
            // InternalProjectsLang.g:941:3: RULE_STRING
            {
             before(grammarAccess.getTaskAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TitleAssignment_1"


    // $ANTLR start "rule__Task__StartAssignment_4"
    // InternalProjectsLang.g:950:1: rule__Task__StartAssignment_4 : ( RULE_INT ) ;
    public final void rule__Task__StartAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:954:1: ( ( RULE_INT ) )
            // InternalProjectsLang.g:955:2: ( RULE_INT )
            {
            // InternalProjectsLang.g:955:2: ( RULE_INT )
            // InternalProjectsLang.g:956:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getStartINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getStartINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__StartAssignment_4"


    // $ANTLR start "rule__Task__DurationAssignment_6"
    // InternalProjectsLang.g:965:1: rule__Task__DurationAssignment_6 : ( RULE_INT ) ;
    public final void rule__Task__DurationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:969:1: ( ( RULE_INT ) )
            // InternalProjectsLang.g:970:2: ( RULE_INT )
            {
            // InternalProjectsLang.g:970:2: ( RULE_INT )
            // InternalProjectsLang.g:971:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DurationAssignment_6"


    // $ANTLR start "rule__Task__EffortAssignment_9"
    // InternalProjectsLang.g:980:1: rule__Task__EffortAssignment_9 : ( ruleEffort ) ;
    public final void rule__Task__EffortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:984:1: ( ( ruleEffort ) )
            // InternalProjectsLang.g:985:2: ( ruleEffort )
            {
            // InternalProjectsLang.g:985:2: ( ruleEffort )
            // InternalProjectsLang.g:986:3: ruleEffort
            {
             before(grammarAccess.getTaskAccess().getEffortEffortParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEffort();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getEffortEffortParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__EffortAssignment_9"


    // $ANTLR start "rule__Task__EffortAssignment_10_1"
    // InternalProjectsLang.g:995:1: rule__Task__EffortAssignment_10_1 : ( ruleEffort ) ;
    public final void rule__Task__EffortAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:999:1: ( ( ruleEffort ) )
            // InternalProjectsLang.g:1000:2: ( ruleEffort )
            {
            // InternalProjectsLang.g:1000:2: ( ruleEffort )
            // InternalProjectsLang.g:1001:3: ruleEffort
            {
             before(grammarAccess.getTaskAccess().getEffortEffortParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffort();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getEffortEffortParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__EffortAssignment_10_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalProjectsLang.g:1010:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:1014:1: ( ( RULE_ID ) )
            // InternalProjectsLang.g:1015:2: ( RULE_ID )
            {
            // InternalProjectsLang.g:1015:2: ( RULE_ID )
            // InternalProjectsLang.g:1016:3: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Effort__PersonAssignment_0"
    // InternalProjectsLang.g:1025:1: rule__Effort__PersonAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Effort__PersonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:1029:1: ( ( ( RULE_ID ) ) )
            // InternalProjectsLang.g:1030:2: ( ( RULE_ID ) )
            {
            // InternalProjectsLang.g:1030:2: ( ( RULE_ID ) )
            // InternalProjectsLang.g:1031:3: ( RULE_ID )
            {
             before(grammarAccess.getEffortAccess().getPersonPersonCrossReference_0_0()); 
            // InternalProjectsLang.g:1032:3: ( RULE_ID )
            // InternalProjectsLang.g:1033:4: RULE_ID
            {
             before(grammarAccess.getEffortAccess().getPersonPersonIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffortAccess().getPersonPersonIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEffortAccess().getPersonPersonCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__PersonAssignment_0"


    // $ANTLR start "rule__Effort__PercentageAssignment_3"
    // InternalProjectsLang.g:1044:1: rule__Effort__PercentageAssignment_3 : ( RULE_INT ) ;
    public final void rule__Effort__PercentageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectsLang.g:1048:1: ( ( RULE_INT ) )
            // InternalProjectsLang.g:1049:2: ( RULE_INT )
            {
            // InternalProjectsLang.g:1049:2: ( RULE_INT )
            // InternalProjectsLang.g:1050:3: RULE_INT
            {
             before(grammarAccess.getEffortAccess().getPercentageINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffortAccess().getPercentageINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effort__PercentageAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000204002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});

}