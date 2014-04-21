/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import java.util.*;
import minipython.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable in;
    private Hashtable out;

    public Object getIn(Node node)
    {
        if(in == null)
        {
            return null;
        }

        return in.get(node);
    }

    public void setIn(Node node, Object in)
    {
        if(this.in == null)
        {
            this.in = new Hashtable(1);
        }

        if(in != null)
        {
            this.in.put(node, in);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(out == null)
        {
            return null;
        }

        return out.get(node);
    }

    public void setOut(Node node, Object out)
    {
        if(this.out == null)
        {
            this.out = new Hashtable(1);
        }

        if(out != null)
        {
            this.out.put(node, out);
        }
        else
        {
            this.out.remove(node);
        }
    }
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAGoal(AGoal node)
    {
        defaultCase(node);
    }

    public void caseAStateCommands(AStateCommands node)
    {
        defaultCase(node);
    }

    public void caseAFuncCommands(AFuncCommands node)
    {
        defaultCase(node);
    }

    public void caseAFunctiondeclFunction(AFunctiondeclFunction node)
    {
        defaultCase(node);
    }

    public void caseAArg1(AArg1 node)
    {
        defaultCase(node);
    }

    public void caseAArg2(AArg2 node)
    {
        defaultCase(node);
    }

    public void caseAArgdeclArgument(AArgdeclArgument node)
    {
        defaultCase(node);
    }

    public void caseACexp(ACexp node)
    {
        defaultCase(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        defaultCase(node);
    }

    public void caseAWhileStatement(AWhileStatement node)
    {
        defaultCase(node);
    }

    public void caseAForStatement(AForStatement node)
    {
        defaultCase(node);
    }

    public void caseAReturnStatement(AReturnStatement node)
    {
        defaultCase(node);
    }

    public void caseAPrintStatement(APrintStatement node)
    {
        defaultCase(node);
    }

    public void caseAValuealocStatement(AValuealocStatement node)
    {
        defaultCase(node);
    }

    public void caseAValuealoc2Statement(AValuealoc2Statement node)
    {
        defaultCase(node);
    }

    public void caseASfunctioncallStatement(ASfunctioncallStatement node)
    {
        defaultCase(node);
    }

    public void caseACval(ACval node)
    {
        defaultCase(node);
    }

    public void caseAPlusPraxi(APlusPraxi node)
    {
        defaultCase(node);
    }

    public void caseAMinusPraxi(AMinusPraxi node)
    {
        defaultCase(node);
    }

    public void caseAMultPraxi(AMultPraxi node)
    {
        defaultCase(node);
    }

    public void caseADivPraxi(ADivPraxi node)
    {
        defaultCase(node);
    }

    public void caseAPraxhExpression(APraxhExpression node)
    {
        defaultCase(node);
    }

    public void caseAExp2Expression(AExp2Expression node)
    {
        defaultCase(node);
    }

    public void caseAFunctExpression(AFunctExpression node)
    {
        defaultCase(node);
    }

    public void caseAValExpression(AValExpression node)
    {
        defaultCase(node);
    }

    public void caseAEidExpression(AEidExpression node)
    {
        defaultCase(node);
    }

    public void caseAExp3Expression(AExp3Expression node)
    {
        defaultCase(node);
    }

    public void caseAExp4Expression(AExp4Expression node)
    {
        defaultCase(node);
    }

    public void caseAGreatSymb(AGreatSymb node)
    {
        defaultCase(node);
    }

    public void caseALessSymb(ALessSymb node)
    {
        defaultCase(node);
    }

    public void caseANeqSymb(ANeqSymb node)
    {
        defaultCase(node);
    }

    public void caseACeqSymb(ACeqSymb node)
    {
        defaultCase(node);
    }

    public void caseACompComparison(ACompComparison node)
    {
        defaultCase(node);
    }

    public void caseATrueComparison(ATrueComparison node)
    {
        defaultCase(node);
    }

    public void caseAFalseComparison(AFalseComparison node)
    {
        defaultCase(node);
    }

    public void caseAFunctioncallFunctionCall(AFunctioncallFunctionCall node)
    {
        defaultCase(node);
    }

    public void caseAArgsArglist(AArgsArglist node)
    {
        defaultCase(node);
    }

    public void caseANumbValue(ANumbValue node)
    {
        defaultCase(node);
    }

    public void caseAStringLiteralValue(AStringLiteralValue node)
    {
        defaultCase(node);
    }

    public void caseAIntLiterNumber(AIntLiterNumber node)
    {
        defaultCase(node);
    }

    public void caseAIdIdentifier(AIdIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    public void caseTNeq(TNeq node)
    {
        defaultCase(node);
    }

    public void caseTCeq(TCeq node)
    {
        defaultCase(node);
    }

    public void caseTExclam(TExclam node)
    {
        defaultCase(node);
    }

    public void caseTDef(TDef node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTLBr(TLBr node)
    {
        defaultCase(node);
    }

    public void caseTRBr(TRBr node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTQmark(TQmark node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTQuote(TQuote node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTElif(TElif node)
    {
        defaultCase(node);
    }

    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    public void caseTFor(TFor node)
    {
        defaultCase(node);
    }

    public void caseTIn(TIn node)
    {
        defaultCase(node);
    }

    public void caseTPrint(TPrint node)
    {
        defaultCase(node);
    }

    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    public void caseTLess(TLess node)
    {
        defaultCase(node);
    }

    public void caseTGreat(TGreat node)
    {
        defaultCase(node);
    }

    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseTStringLiteral(TStringLiteral node)
    {
        defaultCase(node);
    }

    public void caseTIntegerLiteral(TIntegerLiteral node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(Node node)
    {
    }
}
