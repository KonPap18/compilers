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
    void caseAProgramme(AProgramme node);
    void caseAStatementCommands(AStatementCommands node);
    void caseAFunctionCommands(AFunctionCommands node);
    void caseAFunctionDeclarationFunction(AFunctionDeclarationFunction node);
    void caseAArgument(AArgument node);
    void caseAArgumentAllocation(AArgumentAllocation node);
    void caseAAnotherArgument(AAnotherArgument node);
    void caseAIfStatement(AIfStatement node);
    void caseAWhileStatement(AWhileStatement node);
    void caseAForStatement(AForStatement node);
    void caseAReturnStatement(AReturnStatement node);
    void caseAPrintStatement(APrintStatement node);
    void caseAAllocation1Statement(AAllocation1Statement node);
    void caseAAllocation2Statement(AAllocation2Statement node);
    void caseAFunctionCallStatement(AFunctionCallStatement node);
    void caseAAnotherExpression(AAnotherExpression node);
    void caseAMultiplicationExpression(AMultiplicationExpression node);
    void caseADivisionExpression(ADivisionExpression node);
    void caseAAdditionExpression(AAdditionExpression node);
    void caseASubtractionExpression(ASubtractionExpression node);
    void caseAValueExpression(AValueExpression node);
    void caseAIdentifierExpression(AIdentifierExpression node);
    void caseAFunctionCallExpression(AFunctionCallExpression node);
    void caseAIdParExpression(AIdParExpression node);
    void caseAParValuesExpression(AParValuesExpression node);
    void caseAParExpression(AParExpression node);
    void caseAAnotherValue(AAnotherValue node);
    void caseAGreatComparison(AGreatComparison node);
    void caseALessComparison(ALessComparison node);
    void caseANeqComparison(ANeqComparison node);
    void caseACeqComparison(ACeqComparison node);
    void caseAArgumentsList(AArgumentsList node);
    void caseANumberValue(ANumberValue node);
    void caseAStringValue(AStringValue node);

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
    void caseTClass(TClass node);
    void caseEOF(EOF node);
}
