/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclListProgram(ADeclListProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclList(ADeclList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADeclDeclList(ADeclDeclList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDeclDecl(AVarDeclDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunDeclDecl(AFunDeclDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDecl(AVarDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntTypeDecl(AIntTypeDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVoidTypeDecl(AVoidTypeDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATIdVarDeclId(ATIdVarDeclId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDecl2VarDeclId(AVarDecl2VarDeclId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarDecl2(AVarDecl2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunDecl(AFunDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiffCompOp(ADiffCompOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualCompOp(AEqualCompOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterCompOp(AGreaterCompOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessCompOp(ALessCompOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGequalCompOp(AGequalCompOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALequalCompOp(ALequalCompOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAPlusAddOp(APlusAddOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinusAddOp(AMinusAddOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATimesMultOp(ATimesMultOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADivMultOp(ADivMultOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIntegerNumber(TIntegerNumber node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTId(TTId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTNum(TTNum node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentLine(TCommentLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentBlock(TCommentBlock node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVoid(TVoid node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpenBrace(TOpenBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCloseBrace(TCloseBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLsbrack(TLsbrack node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRsbrack(TRsbrack node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLpar(TLpar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRpar(TRpar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTScolon(TScolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtrib(TAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColon(TColon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTimes(TTimes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMod(TMod node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreater(TGreater node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLess(TLess node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGequal(TGequal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLequal(TLequal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiff(TDiff node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentifier(TIdentifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
