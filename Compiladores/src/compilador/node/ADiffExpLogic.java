/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADiffExpLogic extends PExpLogic
{
    private PExpArith _left_;
    private PExpArith _right_;

    public ADiffExpLogic()
    {
        // Constructor
    }

    public ADiffExpLogic(
        @SuppressWarnings("hiding") PExpArith _left_,
        @SuppressWarnings("hiding") PExpArith _right_)
    {
        // Constructor
        setLeft(_left_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new ADiffExpLogic(
            cloneNode(this._left_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADiffExpLogic(this);
    }

    public PExpArith getLeft()
    {
        return this._left_;
    }

    public void setLeft(PExpArith node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public PExpArith getRight()
    {
        return this._right_;
    }

    public void setRight(PExpArith node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PExpArith) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExpArith) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
