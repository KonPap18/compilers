/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import minipython.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object in);
    Object getOut(Node node);
    void setOut(Node node, Object out);

    void caseStart(Start node);
    void caseAGoal(AGoal node);
    void caseAStateCommands(AStateCommands node);
    void caseAFuncCommands(AFuncCommands node);
    void caseAFunctiondeclFunction(AFunctiondeclFunction node);
    void caseAArg1(AArg1 node);
    void caseAArg2(AArg2 node);
    void caseAArgdeclArgument(AArgdeclArgument node);
    void caseACexp(ACexp node);
    void caseAIfStatement(AIfStatement node);
    void caseAWhileStatement(AWhileStatement node);
    void caseAForStatement(AForStatement node);
    void caseAReturnStatement(AReturnStatement node);
    void caseAPrintStatement(APrintStatement node);
    void caseAValuealocStatement(AValuealocStatement node);
    void caseAValuealoc2Statement(AValuealoc2Statement node);
    void caseASfunctioncallStatement(ASfunctioncallStatement node);
    void caseACval(ACval node);
    void caseAPlusPraxi(APlusPraxi node);
    void caseAMinusPraxi(AMinusPraxi node);
    void caseAMultPraxi(AMultPraxi node);
    void caseADivPraxi(ADivPraxi node);
    void caseAPraxhExpression(APraxhExpression node);
    void caseAExp2Expression(AExp2Expression node);
    void caseAFunctExpression(AFunctExpression node);
    void caseAValExpression(AValExpression node);
    void caseAEidExpression(AEidExpression node);
    void caseAExp3Expression(AExp3Expression node);
    void caseAExp4Expression(AExp4Expression node);
    void caseAGreatSymb(AGreatSymb node);
    void caseALessSymb(ALessSymb node);
    void caseANeqSymb(ANeqSymb node);
    void caseACeqSymb(ACeqSymb node);
    void caseACompComparison(ACompComparison node);
    void caseATrueComparison(ATrueComparison node);
    void caseAFalseComparison(AFalseComparison node);
    void caseAFunctioncallFunctionCall(AFunctioncallFunctionCall node);
    void caseAArgsArglist(AArgsArglist node);
    void caseANumbValue(ANumbValue node);
    void caseAStringLiteralValue(AStringLiteralValue node);
    void caseAIntLiterNumber(AIntLiterNumber node);
    void caseAIdIdentifier(AIdIdentifier node);

    void caseTTab(TTab node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTEq(TEq node);
    void caseTNeq(TNeq node);
    void caseTCeq(TCeq node);
    void caseTExclam(TExclam node);
    void caseTDef(TDef node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBr(TLBr node);
    void caseTRBr(TRBr node);
    void caseTComma(TComma node);
    void caseTDot(TDot node);
    void caseTQmark(TQmark node);
    void caseTSemi(TSemi node);
    void caseTQuote(TQuote node);
    void caseTIf(TIf node);
    void caseTElif(TElif node);
    void caseTElse(TElse node);
    void caseTWhile(TWhile node);
    void caseTFor(TFor node);
    void caseTIn(TIn node);
    void caseTPrint(TPrint node);
    void caseTReturn(TReturn node);
    void caseTLess(TLess node);
    void caseTGreat(TGreat node);
    void caseTTrue(TTrue node);
    void caseTFalse(TFalse node);
    void caseTBlank(TBlank node);
    void caseTLineComment(TLineComment node);
    void caseTId(TId node);
    void caseTStringLiteral(TStringLiteral node);
    void caseTIntegerLiteral(TIntegerLiteral node);
    void caseEOF(EOF node);
}
