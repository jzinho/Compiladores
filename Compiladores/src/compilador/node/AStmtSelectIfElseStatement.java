/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AStmtSelectIfElseStatement extends PStatement
{
    private PExpLogic _expLogic_;
    private PStatement _st1_;
    private PStatement _st2_;

    public AStmtSelectIfElseStatement()
    {
        // Constructor
    }

    public AStmtSelectIfElseStatement(
        @SuppressWarnings("hiding") PExpLogic _expLogic_,
        @SuppressWarnings("hiding") PStatement _st1_,
        @SuppressWarnings("hiding") PStatement _st2_)
    {
        // Constructor
        setExpLogic(_expLogic_);

        setSt1(_st1_);

        setSt2(_st2_);

    }

    @Override
    public Object clone()
    {
        return new AStmtSelectIfElseStatement(
            cloneNode(this._expLogic_),
            cloneNode(this._st1_),
            cloneNode(this._st2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStmtSelectIfElseStatement(this);
    }

    public PExpLogic getExpLogic()
    {
        return this._expLogic_;
    }

    public void setExpLogic(PExpLogic node)
    {
        if(this._expLogic_ != null)
        {
            this._expLogic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogic_ = node;
    }

    public PStatement getSt1()
    {
        return this._st1_;
    }

    public void setSt1(PStatement node)
    {
        if(this._st1_ != null)
        {
            this._st1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._st1_ = node;
    }

    public PStatement getSt2()
    {
        return this._st2_;
    }

    public void setSt2(PStatement node)
    {
        if(this._st2_ != null)
        {
            this._st2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._st2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expLogic_)
            + toString(this._st1_)
            + toString(this._st2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expLogic_ == child)
        {
            this._expLogic_ = null;
            return;
        }

        if(this._st1_ == child)
        {
            this._st1_ = null;
            return;
        }

        if(this._st2_ == child)
        {
            this._st2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expLogic_ == oldChild)
        {
            setExpLogic((PExpLogic) newChild);
            return;
        }

        if(this._st1_ == oldChild)
        {
            setSt1((PStatement) newChild);
            return;
        }

        if(this._st2_ == oldChild)
        {
            setSt2((PStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
