/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AVarDeclId extends PVarDeclId
{
    private TTId _tId_;

    public AVarDeclId()
    {
        // Constructor
    }

    public AVarDeclId(
        @SuppressWarnings("hiding") TTId _tId_)
    {
        // Constructor
        setTId(_tId_);

    }

    @Override
    public Object clone()
    {
        return new AVarDeclId(
            cloneNode(this._tId_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarDeclId(this);
    }

    public TTId getTId()
    {
        return this._tId_;
    }

    public void setTId(TTId node)
    {
        if(this._tId_ != null)
        {
            this._tId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tId_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tId_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tId_ == child)
        {
            this._tId_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tId_ == oldChild)
        {
            setTId((TTId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}