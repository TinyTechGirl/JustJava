// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

class this._cls0
    implements OnApplyWindowInsetsListener
{

    final CoordinatorLayout this$0;

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        return setWindowInsets(windowinsetscompat);
    }

    r()
    {
        this$0 = CoordinatorLayout.this;
        super();
    }
}
