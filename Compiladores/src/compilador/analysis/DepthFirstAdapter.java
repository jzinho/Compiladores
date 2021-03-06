/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        {
            List<PDecl> copy = new ArrayList<PDecl>(node.getDecl());
            for(PDecl e : copy)
            {
                e.apply(this);
            }
        }
        outAProgram(node);
    }

    public void inAFunctionDecl(AFunctionDecl node)
    {
        defaultIn(node);
    }

    public void outAFunctionDecl(AFunctionDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionDecl(AFunctionDecl node)
    {
        inAFunctionDecl(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAFunctionDecl(node);
    }

    public void inAMainFuncDecl(AMainFuncDecl node)
    {
        defaultIn(node);
    }

    public void outAMainFuncDecl(AMainFuncDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMainFuncDecl(AMainFuncDecl node)
    {
        inAMainFuncDecl(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getMain() != null)
        {
            node.getMain().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAMainFuncDecl(node);
    }

    public void inAVariableDecl(AVariableDecl node)
    {
        defaultIn(node);
    }

    public void outAVariableDecl(AVariableDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableDecl(AVariableDecl node)
    {
        inAVariableDecl(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getTypevar() != null)
        {
            node.getTypevar().apply(this);
        }
        outAVariableDecl(node);
    }

    public void inAFunDeclDecl(AFunDeclDecl node)
    {
        defaultIn(node);
    }

    public void outAFunDeclDecl(AFunDeclDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunDeclDecl(AFunDeclDecl node)
    {
        inAFunDeclDecl(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PParam> copy = new ArrayList<PParam>(node.getParam());
            for(PParam e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAFunDeclDecl(node);
    }

    public void inAIntType(AIntType node)
    {
        defaultIn(node);
    }

    public void outAIntType(AIntType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
    }

    public void inAStringType(AStringType node)
    {
        defaultIn(node);
    }

    public void outAStringType(AStringType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringType(AStringType node)
    {
        inAStringType(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringType(node);
    }

    public void inAVoidType(AVoidType node)
    {
        defaultIn(node);
    }

    public void outAVoidType(AVoidType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVoidType(AVoidType node)
    {
        inAVoidType(node);
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        outAVoidType(node);
    }

    public void inADeclParamParam(ADeclParamParam node)
    {
        defaultIn(node);
    }

    public void outADeclParamParam(ADeclParamParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclParamParam(ADeclParamParam node)
    {
        inADeclParamParam(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outADeclParamParam(node);
    }

    public void inAParamVoidParam(AParamVoidParam node)
    {
        defaultIn(node);
    }

    public void outAParamVoidParam(AParamVoidParam node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParamVoidParam(AParamVoidParam node)
    {
        inAParamVoidParam(node);
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        outAParamVoidParam(node);
    }

    public void inASingleTypevar(ASingleTypevar node)
    {
        defaultIn(node);
    }

    public void outASingleTypevar(ASingleTypevar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleTypevar(ASingleTypevar node)
    {
        inASingleTypevar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outASingleTypevar(node);
    }

    public void inACompTypevar(ACompTypevar node)
    {
        defaultIn(node);
    }

    public void outACompTypevar(ACompTypevar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompTypevar(ACompTypevar node)
    {
        inACompTypevar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PComp> copy = new ArrayList<PComp>(node.getComp());
            for(PComp e : copy)
            {
                e.apply(this);
            }
        }
        outACompTypevar(node);
    }

    public void inAEmptyComp(AEmptyComp node)
    {
        defaultIn(node);
    }

    public void outAEmptyComp(AEmptyComp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyComp(AEmptyComp node)
    {
        inAEmptyComp(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAEmptyComp(node);
    }

    public void inADimComp(ADimComp node)
    {
        defaultIn(node);
    }

    public void outADimComp(ADimComp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADimComp(ADimComp node)
    {
        inADimComp(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outADimComp(node);
    }

    public void inAStmtExprStatement(AStmtExprStatement node)
    {
        defaultIn(node);
    }

    public void outAStmtExprStatement(AStmtExprStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStmtExprStatement(AStmtExprStatement node)
    {
        inAStmtExprStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAStmtExprStatement(node);
    }

    public void inAStmtReturnStatement(AStmtReturnStatement node)
    {
        defaultIn(node);
    }

    public void outAStmtReturnStatement(AStmtReturnStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStmtReturnStatement(AStmtReturnStatement node)
    {
        inAStmtReturnStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAStmtReturnStatement(node);
    }

    public void inAStmtSelectIfStatement(AStmtSelectIfStatement node)
    {
        defaultIn(node);
    }

    public void outAStmtSelectIfStatement(AStmtSelectIfStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStmtSelectIfStatement(AStmtSelectIfStatement node)
    {
        inAStmtSelectIfStatement(node);
        if(node.getExpLogic() != null)
        {
            node.getExpLogic().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAStmtSelectIfStatement(node);
    }

    public void inAStmtSelectIfElseStatement(AStmtSelectIfElseStatement node)
    {
        defaultIn(node);
    }

    public void outAStmtSelectIfElseStatement(AStmtSelectIfElseStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStmtSelectIfElseStatement(AStmtSelectIfElseStatement node)
    {
        inAStmtSelectIfElseStatement(node);
        if(node.getExpLogic() != null)
        {
            node.getExpLogic().apply(this);
        }
        if(node.getSt1() != null)
        {
            node.getSt1().apply(this);
        }
        if(node.getSt2() != null)
        {
            node.getSt2().apply(this);
        }
        outAStmtSelectIfElseStatement(node);
    }

    public void inACompStmtStatement(ACompStmtStatement node)
    {
        defaultIn(node);
    }

    public void outACompStmtStatement(ACompStmtStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompStmtStatement(ACompStmtStatement node)
    {
        inACompStmtStatement(node);
        {
            List<PDecl> copy = new ArrayList<PDecl>(node.getDecl());
            for(PDecl e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outACompStmtStatement(node);
    }

    public void inAIterationStatement(AIterationStatement node)
    {
        defaultIn(node);
    }

    public void outAIterationStatement(AIterationStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIterationStatement(AIterationStatement node)
    {
        inAIterationStatement(node);
        if(node.getExpLogic() != null)
        {
            node.getExpLogic().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAIterationStatement(node);
    }

    public void inACallStatement(ACallStatement node)
    {
        defaultIn(node);
    }

    public void outACallStatement(ACallStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACallStatement(ACallStatement node)
    {
        inACallStatement(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outACallStatement(node);
    }

    public void inAEmptyStatement(AEmptyStatement node)
    {
        defaultIn(node);
    }

    public void outAEmptyStatement(AEmptyStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyStatement(AEmptyStatement node)
    {
        inAEmptyStatement(node);
        outAEmptyStatement(node);
    }

    public void inAAttExpression(AAttExpression node)
    {
        defaultIn(node);
    }

    public void outAAttExpression(AAttExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAttExpression(AAttExpression node)
    {
        inAAttExpression(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAAttExpression(node);
    }

    public void inAExpArithExpression(AExpArithExpression node)
    {
        defaultIn(node);
    }

    public void outAExpArithExpression(AExpArithExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpArithExpression(AExpArithExpression node)
    {
        inAExpArithExpression(node);
        if(node.getExpArith() != null)
        {
            node.getExpArith().apply(this);
        }
        outAExpArithExpression(node);
    }

    public void inAExpLogicExpression(AExpLogicExpression node)
    {
        defaultIn(node);
    }

    public void outAExpLogicExpression(AExpLogicExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogicExpression(AExpLogicExpression node)
    {
        inAExpLogicExpression(node);
        if(node.getExpLogic() != null)
        {
            node.getExpLogic().apply(this);
        }
        outAExpLogicExpression(node);
    }

    public void inADiffExpLogic(ADiffExpLogic node)
    {
        defaultIn(node);
    }

    public void outADiffExpLogic(ADiffExpLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiffExpLogic(ADiffExpLogic node)
    {
        inADiffExpLogic(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADiffExpLogic(node);
    }

    public void inAEqualequalExpLogic(AEqualequalExpLogic node)
    {
        defaultIn(node);
    }

    public void outAEqualequalExpLogic(AEqualequalExpLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualequalExpLogic(AEqualequalExpLogic node)
    {
        inAEqualequalExpLogic(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAEqualequalExpLogic(node);
    }

    public void inAGreaterExpLogic(AGreaterExpLogic node)
    {
        defaultIn(node);
    }

    public void outAGreaterExpLogic(AGreaterExpLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterExpLogic(AGreaterExpLogic node)
    {
        inAGreaterExpLogic(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGreaterExpLogic(node);
    }

    public void inALessExpLogic(ALessExpLogic node)
    {
        defaultIn(node);
    }

    public void outALessExpLogic(ALessExpLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessExpLogic(ALessExpLogic node)
    {
        inALessExpLogic(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALessExpLogic(node);
    }

    public void inAGequalExpLogic(AGequalExpLogic node)
    {
        defaultIn(node);
    }

    public void outAGequalExpLogic(AGequalExpLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGequalExpLogic(AGequalExpLogic node)
    {
        inAGequalExpLogic(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGequalExpLogic(node);
    }

    public void inALequalExpLogic(ALequalExpLogic node)
    {
        defaultIn(node);
    }

    public void outALequalExpLogic(ALequalExpLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALequalExpLogic(ALequalExpLogic node)
    {
        inALequalExpLogic(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALequalExpLogic(node);
    }

    public void inAPlusExpArith(APlusExpArith node)
    {
        defaultIn(node);
    }

    public void outAPlusExpArith(APlusExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExpArith(APlusExpArith node)
    {
        inAPlusExpArith(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAPlusExpArith(node);
    }

    public void inAMinusExpArith(AMinusExpArith node)
    {
        defaultIn(node);
    }

    public void outAMinusExpArith(AMinusExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpArith(AMinusExpArith node)
    {
        inAMinusExpArith(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMinusExpArith(node);
    }

    public void inATimesExpArith(ATimesExpArith node)
    {
        defaultIn(node);
    }

    public void outATimesExpArith(ATimesExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATimesExpArith(ATimesExpArith node)
    {
        inATimesExpArith(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outATimesExpArith(node);
    }

    public void inADivExpArith(ADivExpArith node)
    {
        defaultIn(node);
    }

    public void outADivExpArith(ADivExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExpArith(ADivExpArith node)
    {
        inADivExpArith(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivExpArith(node);
    }

    public void inAModExpArith(AModExpArith node)
    {
        defaultIn(node);
    }

    public void outAModExpArith(AModExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModExpArith(AModExpArith node)
    {
        inAModExpArith(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAModExpArith(node);
    }

    public void inANumExpArith(ANumExpArith node)
    {
        defaultIn(node);
    }

    public void outANumExpArith(ANumExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumExpArith(ANumExpArith node)
    {
        inANumExpArith(node);
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outANumExpArith(node);
    }

    public void inAVariableFExpArith(AVariableFExpArith node)
    {
        defaultIn(node);
    }

    public void outAVariableFExpArith(AVariableFExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableFExpArith(AVariableFExpArith node)
    {
        inAVariableFExpArith(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAVariableFExpArith(node);
    }

    public void inATypevarExpArith(ATypevarExpArith node)
    {
        defaultIn(node);
    }

    public void outATypevarExpArith(ATypevarExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATypevarExpArith(ATypevarExpArith node)
    {
        inATypevarExpArith(node);
        if(node.getTypevar() != null)
        {
            node.getTypevar().apply(this);
        }
        outATypevarExpArith(node);
    }

    public void inACallExpArith(ACallExpArith node)
    {
        defaultIn(node);
    }

    public void outACallExpArith(ACallExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACallExpArith(ACallExpArith node)
    {
        inACallExpArith(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PExpression> copy = new ArrayList<PExpression>(node.getExpression());
            for(PExpression e : copy)
            {
                e.apply(this);
            }
        }
        outACallExpArith(node);
    }

    public void inAExpressionExpArith(AExpressionExpArith node)
    {
        defaultIn(node);
    }

    public void outAExpressionExpArith(AExpressionExpArith node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressionExpArith(AExpressionExpArith node)
    {
        inAExpressionExpArith(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAExpressionExpArith(node);
    }
}
