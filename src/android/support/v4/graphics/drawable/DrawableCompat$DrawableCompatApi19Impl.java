// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableCompat, TintAwareDrawable, DrawableWrapperApi19

static class Q extends Q
{

    public int getAlpha(Drawable drawable)
    {
        return drawable.getAlpha();
    }

    public boolean isAutoMirrored(Drawable drawable)
    {
        return drawable.isAutoMirrored();
    }

    public void setAutoMirrored(Drawable drawable, boolean flag)
    {
        drawable.setAutoMirrored(flag);
    }

    public Drawable wrap(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof TintAwareDrawable))
        {
            obj = new DrawableWrapperApi19(drawable);
        }
        return ((Drawable) (obj));
    }

    Q()
    {
    }
}
