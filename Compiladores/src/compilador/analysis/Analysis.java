/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import compilador.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseAFunctionDecl(AFunctionDecl node);
    void caseAMainFuncDecl(AMainFuncDecl node);
    void caseAVariableDecl(AVariableDecl node);
    void caseAFunDeclDecl(AFunDeclDecl node);
    void caseAIntType(AIntType node);
    void caseAStringType(AStringType node);
    void caseAVoidType(AVoidType node);
    void caseADeclParamParam(ADeclParamParam node);
    void caseAParamVoidParam(AParamVoidParam node);
    void caseASingleTypevar(ASingleTypevar node);
    void caseACompTypevar(ACompTypevar node);
    void caseAEmptyComp(AEmptyComp node);
    void caseADimComp(ADimComp node);
    void caseAStmtExprStatement(AStmtExprStatement node);
    void caseAStmtReturnStatement(AStmtReturnStatement node);
    void caseAStmtSelectIfStatement(AStmtSelectIfStatement node);
    void caseAStmtSelectIfElseStatement(AStmtSelectIfElseStatement node);
    void caseACompStmtStatement(ACompStmtStatement node);
    void caseAIterationStatement(AIterationStatement node);
    void caseACallStatement(ACallStatement node);
    void caseAEmptyStatement(AEmptyStatement node);
    void caseAAttExpression(AAttExpression node);
    void caseAExpArithExpression(AExpArithExpression node);
    void caseAExpLogicExpression(AExpLogicExpression node);
    void caseADiffExpLogic(ADiffExpLogic node);
    void caseAEqualequalExpLogic(AEqualequalExpLogic node);
    void caseAGreaterExpLogic(AGreaterExpLogic node);
    void caseALessExpLogic(ALessExpLogic node);
    void caseAGequalExpLogic(AGequalExpLogic node);
    void caseALequalExpLogic(ALequalExpLogic node);
    void caseAPlusExpArith(APlusExpArith node);
    void caseAMinusExpArith(AMinusExpArith node);
    void caseATimesExpArith(ATimesExpArith node);
    void caseADivExpArith(ADivExpArith node);
    void caseAModExpArith(AModExpArith node);
    void caseANumExpArith(ANumExpArith node);
    void caseAVariableFExpArith(AVariableFExpArith node);
    void caseATypevarExpArith(ATypevarExpArith node);
    void caseACallExpArith(ACallExpArith node);
    void caseAExpressionExpArith(AExpressionExpArith node);

    void caseTInput(TInput node);
    void caseTOutput(TOutput node);
    void caseTBlank(TBlank node);
    void caseTString(TString node);
    void caseTInt(TInt node);
    void caseTCommentLine(TCommentLine node);
    void caseTCommentBlock(TCommentBlock node);
    void caseTIf(TIf node);
    void caseTElse(TElse node);
    void caseTReturn(TReturn node);
    void caseTVoid(TVoid node);
    void caseTWhile(TWhile node);
    void caseTOpenBrace(TOpenBrace node);
    void caseTCloseBrace(TCloseBrace node);
    void caseTLsbrack(TLsbrack node);
    void caseTRsbrack(TRsbrack node);
    void caseTLpar(TLpar node);
    void caseTRpar(TRpar node);
    void caseTComma(TComma node);
    void caseTScolon(TScolon node);
    void caseTAtrib(TAtrib node);
    void caseTColon(TColon node);
    void caseTDiv(TDiv node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTTimes(TTimes node);
    void caseTMod(TMod node);
    void caseTGreater(TGreater node);
    void caseTLess(TLess node);
    void caseTGequal(TGequal node);
    void caseTLequal(TLequal node);
    void caseTNot(TNot node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTXor(TXor node);
    void caseTDiff(TDiff node);
    void caseTEqual(TEqual node);
    void caseTEqualequal(TEqualequal node);
    void caseTMain(TMain node);
    void caseTId(TId node);
    void caseTNum(TNum node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
