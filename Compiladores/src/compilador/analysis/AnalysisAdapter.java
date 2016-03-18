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
    public void caseAIdVarDeclId(AIdVarDeclId node)
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
    public void caseAExpressionStatement(AExpressionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompoundStatement(ACompoundStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASelectionStatement(ASelectionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIterationStatement(AIterationStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturnStatement(AReturnStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpressionStmt(AExpressionStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAScolonExpressionStmt(AScolonExpressionStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStatementList(AStatementList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAScolonStatementList(AScolonStatementList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompoundStmt(ACompoundStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfSelectionStmt(AIfSelectionStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIterationStmt(AIterationStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturn1ReturnStmt(AReturn1ReturnStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReturn2ReturnStmt(AReturn2ReturnStmt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComparationExpression(AComparationExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAddExpression(AAddExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALocalDeclaration(ALocalDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAScolonLocalDeclaration(AScolonLocalDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAA1SimpleExpression(AA1SimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAA2SimpleExpression(AA2SimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAddExp2(AAddExp2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAddtermAddExp(AAddtermAddExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermAddExp(ATermAddExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAScolonTerm(AScolonTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdcompostoVar(AIdcompostoVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiffRelOp(ADiffRelOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEqualRelOp(AEqualRelOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGreaterRelOp(AGreaterRelOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALessRelOp(ALessRelOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAGequalRelOp(AGequalRelOp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALequalRelOp(ALequalRelOp node)
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
    public void caseAModMultOp(AModMultOp node)
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
