// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

class  extends AnimatorListenerAdapter
{

    final DefaultItemAnimator this$0;
    final ViewPropertyAnimator val$animation;
    final r val$holder;
    final View val$view;

    public void onAnimationCancel(Animator animator)
    {
        val$view.setAlpha(1.0F);
    }

    public void onAnimationEnd(Animator animator)
    {
        val$animation.setListener(null);
        dispatchAddFinished(val$holder);
        mAddAnimations.remove(val$holder);
        dispatchFinishedWhenDone();
    }

    public void onAnimationStart(Animator animator)
    {
        dispatchAddStarting(val$holder);
    }

    r()
    {
        this$0 = final_defaultitemanimator;
        val$holder = r;
        val$view = view1;
        val$animation = ViewPropertyAnimator.this;
        super();
    }
}
