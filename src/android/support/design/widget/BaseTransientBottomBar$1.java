// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Message;

// Referenced classes of package android.support.design.widget:
//            BaseTransientBottomBar

static final class 
    implements android.os.ansientBottomBar._cls1
{

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            ((BaseTransientBottomBar)message.obj).showView();
            return true;

        case 1: // '\001'
            ((BaseTransientBottomBar)message.obj).hideView(message.arg1);
            break;
        }
        return true;
    }

    ()
    {
    }
}
