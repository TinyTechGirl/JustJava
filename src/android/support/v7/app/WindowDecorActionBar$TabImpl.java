// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            WindowDecorActionBar

public class mPosition extends mPosition
{

    private mPosition mCallback;
    private CharSequence mContentDesc;
    private View mCustomView;
    private Drawable mIcon;
    private int mPosition;
    private Object mTag;
    private CharSequence mText;
    final WindowDecorActionBar this$0;

    public mPosition getCallback()
    {
        return mCallback;
    }

    public CharSequence getContentDescription()
    {
        return mContentDesc;
    }

    public View getCustomView()
    {
        return mCustomView;
    }

    public Drawable getIcon()
    {
        return mIcon;
    }

    public int getPosition()
    {
        return mPosition;
    }

    public Object getTag()
    {
        return mTag;
    }

    public CharSequence getText()
    {
        return mText;
    }

    public void select()
    {
        selectTab(this);
    }

    public b setContentDescription(int i)
    {
        return setContentDescription(mContext.getResources().getText(i));
    }

    public  setContentDescription(CharSequence charsequence)
    {
        mContentDesc = charsequence;
        if (mPosition >= 0)
        {
            mTabScrollView.updateTab(mPosition);
        }
        return this;
    }

    public mPosition setCustomView(int i)
    {
        return setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, null));
    }

    public dContext setCustomView(View view)
    {
        mCustomView = view;
        if (mPosition >= 0)
        {
            mTabScrollView.updateTab(mPosition);
        }
        return this;
    }

    public mPosition setIcon(int i)
    {
        return setIcon(AppCompatResources.getDrawable(mContext, i));
    }

    public  setIcon(Drawable drawable)
    {
        mIcon = drawable;
        if (mPosition >= 0)
        {
            mTabScrollView.updateTab(mPosition);
        }
        return this;
    }

    public void setPosition(int i)
    {
        mPosition = i;
    }

    public mPosition setTabListener(mPosition mposition)
    {
        mCallback = mposition;
        return this;
    }

    public mCallback setTag(Object obj)
    {
        mTag = obj;
        return this;
    }

    public mTag setText(int i)
    {
        return setText(mContext.getResources().getText(i));
    }

    public  setText(CharSequence charsequence)
    {
        mText = charsequence;
        if (mPosition >= 0)
        {
            mTabScrollView.updateTab(mPosition);
        }
        return this;
    }

    public _cls9()
    {
        this$0 = WindowDecorActionBar.this;
        super();
        mPosition = -1;
    }
}
