package uk.ac.kcl.inf.fame.projects.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.fame.projects.services.ProjectsLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectsLangParser extends AbstractInternalAntlrParser {
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

        public InternalProjectsLangParser(TokenStream input, ProjectsLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Project";
       	}

       	@Override
       	protected ProjectsLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProject"
    // InternalProjectsLang.g:64:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalProjectsLang.g:64:48: (iv_ruleProject= ruleProject EOF )
            // InternalProjectsLang.g:65:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalProjectsLang.g:71:1: ruleProject returns [EObject current=null] : (otherlv_0= 'project' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'described' otherlv_3= 'as' ( (lv_description_4_0= RULE_STRING ) ) ( ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_people_6_0= rulePerson ) ) )* ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        EObject lv_tasks_5_0 = null;

        EObject lv_people_6_0 = null;



        	enterRule();

        try {
            // InternalProjectsLang.g:77:2: ( (otherlv_0= 'project' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'described' otherlv_3= 'as' ( (lv_description_4_0= RULE_STRING ) ) ( ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_people_6_0= rulePerson ) ) )* ) )
            // InternalProjectsLang.g:78:2: (otherlv_0= 'project' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'described' otherlv_3= 'as' ( (lv_description_4_0= RULE_STRING ) ) ( ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_people_6_0= rulePerson ) ) )* )
            {
            // InternalProjectsLang.g:78:2: (otherlv_0= 'project' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'described' otherlv_3= 'as' ( (lv_description_4_0= RULE_STRING ) ) ( ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_people_6_0= rulePerson ) ) )* )
            // InternalProjectsLang.g:79:3: otherlv_0= 'project' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'described' otherlv_3= 'as' ( (lv_description_4_0= RULE_STRING ) ) ( ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_people_6_0= rulePerson ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalProjectsLang.g:83:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalProjectsLang.g:84:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalProjectsLang.g:84:4: (lv_title_1_0= RULE_STRING )
            // InternalProjectsLang.g:85:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_title_1_0, grammarAccess.getProjectAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getDescribedKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getAsKeyword_3());
            		
            // InternalProjectsLang.g:109:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalProjectsLang.g:110:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalProjectsLang.g:110:4: (lv_description_4_0= RULE_STRING )
            // InternalProjectsLang.g:111:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_description_4_0, grammarAccess.getProjectAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalProjectsLang.g:127:3: ( ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_people_6_0= rulePerson ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==21) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjectsLang.g:128:4: ( (lv_tasks_5_0= ruleTask ) )
            	    {
            	    // InternalProjectsLang.g:128:4: ( (lv_tasks_5_0= ruleTask ) )
            	    // InternalProjectsLang.g:129:5: (lv_tasks_5_0= ruleTask )
            	    {
            	    // InternalProjectsLang.g:129:5: (lv_tasks_5_0= ruleTask )
            	    // InternalProjectsLang.g:130:6: lv_tasks_5_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_tasks_5_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_5_0,
            	    							"uk.ac.kcl.inf.fame.projects.ProjectsLang.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalProjectsLang.g:148:4: ( (lv_people_6_0= rulePerson ) )
            	    {
            	    // InternalProjectsLang.g:148:4: ( (lv_people_6_0= rulePerson ) )
            	    // InternalProjectsLang.g:149:5: (lv_people_6_0= rulePerson )
            	    {
            	    // InternalProjectsLang.g:149:5: (lv_people_6_0= rulePerson )
            	    // InternalProjectsLang.g:150:6: lv_people_6_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getPeoplePersonParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_people_6_0=rulePerson();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"people",
            	    							lv_people_6_0,
            	    							"uk.ac.kcl.inf.fame.projects.ProjectsLang.Person");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTask"
    // InternalProjectsLang.g:172:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalProjectsLang.g:172:45: (iv_ruleTask= ruleTask EOF )
            // InternalProjectsLang.g:173:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalProjectsLang.g:179:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'from' otherlv_3= 'month' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= 'for' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'months' otherlv_8= 'involves' ( (lv_effort_9_0= ruleEffort ) ) (otherlv_10= 'and' ( (lv_effort_11_0= ruleEffort ) ) )* ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_start_4_0=null;
        Token otherlv_5=null;
        Token lv_duration_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_effort_9_0 = null;

        EObject lv_effort_11_0 = null;



        	enterRule();

        try {
            // InternalProjectsLang.g:185:2: ( (otherlv_0= 'task' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'from' otherlv_3= 'month' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= 'for' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'months' otherlv_8= 'involves' ( (lv_effort_9_0= ruleEffort ) ) (otherlv_10= 'and' ( (lv_effort_11_0= ruleEffort ) ) )* ) )
            // InternalProjectsLang.g:186:2: (otherlv_0= 'task' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'from' otherlv_3= 'month' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= 'for' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'months' otherlv_8= 'involves' ( (lv_effort_9_0= ruleEffort ) ) (otherlv_10= 'and' ( (lv_effort_11_0= ruleEffort ) ) )* )
            {
            // InternalProjectsLang.g:186:2: (otherlv_0= 'task' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'from' otherlv_3= 'month' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= 'for' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'months' otherlv_8= 'involves' ( (lv_effort_9_0= ruleEffort ) ) (otherlv_10= 'and' ( (lv_effort_11_0= ruleEffort ) ) )* )
            // InternalProjectsLang.g:187:3: otherlv_0= 'task' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'from' otherlv_3= 'month' ( (lv_start_4_0= RULE_INT ) ) otherlv_5= 'for' ( (lv_duration_6_0= RULE_INT ) ) otherlv_7= 'months' otherlv_8= 'involves' ( (lv_effort_9_0= ruleEffort ) ) (otherlv_10= 'and' ( (lv_effort_11_0= ruleEffort ) ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalProjectsLang.g:191:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalProjectsLang.g:192:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalProjectsLang.g:192:4: (lv_title_1_0= RULE_STRING )
            // InternalProjectsLang.g:193:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_title_1_0, grammarAccess.getTaskAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getFromKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getMonthKeyword_3());
            		
            // InternalProjectsLang.g:217:3: ( (lv_start_4_0= RULE_INT ) )
            // InternalProjectsLang.g:218:4: (lv_start_4_0= RULE_INT )
            {
            // InternalProjectsLang.g:218:4: (lv_start_4_0= RULE_INT )
            // InternalProjectsLang.g:219:5: lv_start_4_0= RULE_INT
            {
            lv_start_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_start_4_0, grammarAccess.getTaskAccess().getStartINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getForKeyword_5());
            		
            // InternalProjectsLang.g:239:3: ( (lv_duration_6_0= RULE_INT ) )
            // InternalProjectsLang.g:240:4: (lv_duration_6_0= RULE_INT )
            {
            // InternalProjectsLang.g:240:4: (lv_duration_6_0= RULE_INT )
            // InternalProjectsLang.g:241:5: lv_duration_6_0= RULE_INT
            {
            lv_duration_6_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_duration_6_0, grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getMonthsKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getInvolvesKeyword_8());
            		
            // InternalProjectsLang.g:265:3: ( (lv_effort_9_0= ruleEffort ) )
            // InternalProjectsLang.g:266:4: (lv_effort_9_0= ruleEffort )
            {
            // InternalProjectsLang.g:266:4: (lv_effort_9_0= ruleEffort )
            // InternalProjectsLang.g:267:5: lv_effort_9_0= ruleEffort
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getEffortEffortParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_effort_9_0=ruleEffort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					add(
            						current,
            						"effort",
            						lv_effort_9_0,
            						"uk.ac.kcl.inf.fame.projects.ProjectsLang.Effort");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalProjectsLang.g:284:3: (otherlv_10= 'and' ( (lv_effort_11_0= ruleEffort ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalProjectsLang.g:285:4: otherlv_10= 'and' ( (lv_effort_11_0= ruleEffort ) )
            	    {
            	    otherlv_10=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getAndKeyword_10_0());
            	    			
            	    // InternalProjectsLang.g:289:4: ( (lv_effort_11_0= ruleEffort ) )
            	    // InternalProjectsLang.g:290:5: (lv_effort_11_0= ruleEffort )
            	    {
            	    // InternalProjectsLang.g:290:5: (lv_effort_11_0= ruleEffort )
            	    // InternalProjectsLang.g:291:6: lv_effort_11_0= ruleEffort
            	    {

            	    						newCompositeNode(grammarAccess.getTaskAccess().getEffortEffortParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_effort_11_0=ruleEffort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskRule());
            	    						}
            	    						add(
            	    							current,
            	    							"effort",
            	    							lv_effort_11_0,
            	    							"uk.ac.kcl.inf.fame.projects.ProjectsLang.Effort");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRulePerson"
    // InternalProjectsLang.g:313:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalProjectsLang.g:313:47: (iv_rulePerson= rulePerson EOF )
            // InternalProjectsLang.g:314:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalProjectsLang.g:320:1: rulePerson returns [EObject current=null] : (otherlv_0= 'person' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalProjectsLang.g:326:2: ( (otherlv_0= 'person' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalProjectsLang.g:327:2: (otherlv_0= 'person' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalProjectsLang.g:327:2: (otherlv_0= 'person' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalProjectsLang.g:328:3: otherlv_0= 'person' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalProjectsLang.g:332:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectsLang.g:333:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectsLang.g:333:4: (lv_name_1_0= RULE_ID )
            // InternalProjectsLang.g:334:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEffort"
    // InternalProjectsLang.g:354:1: entryRuleEffort returns [EObject current=null] : iv_ruleEffort= ruleEffort EOF ;
    public final EObject entryRuleEffort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffort = null;


        try {
            // InternalProjectsLang.g:354:47: (iv_ruleEffort= ruleEffort EOF )
            // InternalProjectsLang.g:355:2: iv_ruleEffort= ruleEffort EOF
            {
             newCompositeNode(grammarAccess.getEffortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffort=ruleEffort();

            state._fsp--;

             current =iv_ruleEffort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffort"


    // $ANTLR start "ruleEffort"
    // InternalProjectsLang.g:361:1: ruleEffort returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'works' otherlv_2= 'for' ( (lv_percentage_3_0= RULE_INT ) ) otherlv_4= '%' ) ;
    public final EObject ruleEffort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_percentage_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalProjectsLang.g:367:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'works' otherlv_2= 'for' ( (lv_percentage_3_0= RULE_INT ) ) otherlv_4= '%' ) )
            // InternalProjectsLang.g:368:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'works' otherlv_2= 'for' ( (lv_percentage_3_0= RULE_INT ) ) otherlv_4= '%' )
            {
            // InternalProjectsLang.g:368:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'works' otherlv_2= 'for' ( (lv_percentage_3_0= RULE_INT ) ) otherlv_4= '%' )
            // InternalProjectsLang.g:369:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'works' otherlv_2= 'for' ( (lv_percentage_3_0= RULE_INT ) ) otherlv_4= '%'
            {
            // InternalProjectsLang.g:369:3: ( (otherlv_0= RULE_ID ) )
            // InternalProjectsLang.g:370:4: (otherlv_0= RULE_ID )
            {
            // InternalProjectsLang.g:370:4: (otherlv_0= RULE_ID )
            // InternalProjectsLang.g:371:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffortRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getEffortAccess().getPersonPersonCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEffortAccess().getWorksKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEffortAccess().getForKeyword_2());
            		
            // InternalProjectsLang.g:390:3: ( (lv_percentage_3_0= RULE_INT ) )
            // InternalProjectsLang.g:391:4: (lv_percentage_3_0= RULE_INT )
            {
            // InternalProjectsLang.g:391:4: (lv_percentage_3_0= RULE_INT )
            // InternalProjectsLang.g:392:5: lv_percentage_3_0= RULE_INT
            {
            lv_percentage_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_percentage_3_0, grammarAccess.getEffortAccess().getPercentageINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEffortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"percentage",
            						lv_percentage_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEffortAccess().getPercentSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffort"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000204002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});

}