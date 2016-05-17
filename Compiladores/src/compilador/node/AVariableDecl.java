/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AVariableDecl extends PDecl
{
    private PType _type_;
    private PTypevar _typevar_;

    public AVariableDecl()
    {
        // Constructor
    }

    public AVariableDecl(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") PTypevar _typevar_)
    {
        // Constructor
        setType(_type_);

        setTypevar(_typevar_);

    }

    @Override
    public Object clone()
    {
        return new AVariableDecl(
            cloneNode(this._type_),
            cloneNode(this._typevar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariableDecl(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public PTypevar getTypevar()
    {
        return this._typevar_;
    }

    public void setTypevar(PTypevar node)
    {
        if(this._typevar_ != null)
        {
            this._typevar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._typevar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._typevar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._typevar_ == child)
        {
            this._typevar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._typevar_ == oldChild)
        {
            setTypevar((PTypevar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}