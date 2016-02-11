/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import compilador.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

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
    void caseTIdentifier(TIdentifier node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
