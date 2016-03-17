/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADeclListProgram extends PProgram
{
    private PDeclList _declList_;

    public ADeclListProgram()
    {
        // Constructor
    }

    public ADeclListProgram(
        @SuppressWarnings("hiding") PDeclList _declList_)
    {
        // Constructor
        setDeclList(_declList_);

    }

    @Override
    public Object clone()
    {
        return new ADeclListProgram(
            cloneNode(this._declList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclListProgram(this);
    }

    public PDeclList getDeclList()
    {
        return this._declList_;
    }

    public void setDeclList(PDeclList node)
    {
        if(this._declList_ != null)
        {
            this._declList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declList_ == child)
        {
            this._declList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declList_ == oldChild)
        {
            setDeclList((PDeclList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}