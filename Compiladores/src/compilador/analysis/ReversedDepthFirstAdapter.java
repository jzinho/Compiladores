/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import java.util.*;
import compilador.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
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
        node.getEOF().apply(this);
        node.getPProgram().apply(this);
        outStart(node);
    }

    public void inADeclListProgram(ADeclListProgram node)
    {
        defaultIn(node);
    }

    public void outADeclListProgram(ADeclListProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclListProgram(ADeclListProgram node)
    {
        inADeclListProgram(node);
        if(node.getDeclList() != null)
        {
            node.getDeclList().apply(this);
        }
        outADeclListProgram(node);
    }

    public void inADeclList(ADeclList node)
    {
        defaultIn(node);
    }

    public void outADeclList(ADeclList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclList(ADeclList node)
    {
        inADeclList(node);
        if(node.getDecl() != null)
        {
            node.getDecl().apply(this);
        }
        if(node.getDeclList() != null)
        {
            node.getDeclList().apply(this);
        }
        outADeclList(node);
    }

    public void inADeclDeclList(ADeclDeclList node)
    {
        defaultIn(node);
    }

    public void outADeclDeclList(ADeclDeclList node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclDeclList(ADeclDeclList node)
    {
        inADeclDeclList(node);
        if(node.getDecl() != null)
        {
            node.getDecl().apply(this);
        }
        outADeclDeclList(node);
    }

    public void inAVarDeclDecl(AVarDeclDecl node)
    {
        defaultIn(node);
    }

    public void outAVarDeclDecl(AVarDeclDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDeclDecl(AVarDeclDecl node)
    {
        inAVarDeclDecl(node);
        if(node.getVarDecl() != null)
        {
            node.getVarDecl().apply(this);
        }
        outAVarDeclDecl(node);
    }

    public void inAVarDecl(AVarDecl node)
    {
        defaultIn(node);
    }

    public void outAVarDecl(AVarDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDecl(AVarDecl node)
    {
        inAVarDecl(node);
        if(node.getTId() != null)
        {
            node.getTId().apply(this);
        }
        if(node.getTypeDecl() != null)
        {
            node.getTypeDecl().apply(this);
        }
        outAVarDecl(node);
    }

    public void inAIntTypeDecl(AIntTypeDecl node)
    {
        defaultIn(node);
    }

    public void outAIntTypeDecl(AIntTypeDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntTypeDecl(AIntTypeDecl node)
    {
        inAIntTypeDecl(node);
        if(node.getIntegerNumber() != null)
        {
            node.getIntegerNumber().apply(this);
        }
        outAIntTypeDecl(node);
    }

    public void inAVoidTypeDecl(AVoidTypeDecl node)
    {
        defaultIn(node);
    }

    public void outAVoidTypeDecl(AVoidTypeDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVoidTypeDecl(AVoidTypeDecl node)
    {
        inAVoidTypeDecl(node);
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        outAVoidTypeDecl(node);
    }

    public void inAVarDeclId(AVarDeclId node)
    {
        defaultIn(node);
    }

    public void outAVarDeclId(AVarDeclId node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDeclId(AVarDeclId node)
    {
        inAVarDeclId(node);
        if(node.getTId() != null)
        {
            node.getTId().apply(this);
        }
        outAVarDeclId(node);
    }

    public void inAPlusAddOp(APlusAddOp node)
    {
        defaultIn(node);
    }

    public void outAPlusAddOp(APlusAddOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusAddOp(APlusAddOp node)
    {
        inAPlusAddOp(node);
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        outAPlusAddOp(node);
    }

    public void inAMinusAddOp(AMinusAddOp node)
    {
        defaultIn(node);
    }

    public void outAMinusAddOp(AMinusAddOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusAddOp(AMinusAddOp node)
    {
        inAMinusAddOp(node);
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        outAMinusAddOp(node);
    }

    public void inATimesMultOp(ATimesMultOp node)
    {
        defaultIn(node);
    }

    public void outATimesMultOp(ATimesMultOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATimesMultOp(ATimesMultOp node)
    {
        inATimesMultOp(node);
        if(node.getTimes() != null)
        {
            node.getTimes().apply(this);
        }
        outATimesMultOp(node);
    }

    public void inADivMultOp(ADivMultOp node)
    {
        defaultIn(node);
    }

    public void outADivMultOp(ADivMultOp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivMultOp(ADivMultOp node)
    {
        inADivMultOp(node);
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        outADivMultOp(node);
    }
}
