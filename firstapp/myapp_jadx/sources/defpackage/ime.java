package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.b;

/* JADX INFO: loaded from: classes6.dex */
public final class ime {
    public static final View a(Dialog dialog) {
        View viewPeekDecorView;
        Window window = dialog.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || !(viewPeekDecorView instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) viewPeekDecorView;
        if (viewGroup.getChildCount() > 0) {
            return viewGroup.getChildAt(0);
        }
        return null;
    }

    public static final void b(Context context, final ple pleVar) {
        context.getClass();
        b.a title = new b.a(context).setTitle(pleVar.f);
        title.a.f = Html.fromHtml(pleVar.a, 0);
        title.b(pleVar.d, pleVar.e);
        title.c(pleVar.b, pleVar.c);
        final b bVarCreate = title.create();
        bVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hme
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Integer num = pleVar.g;
                if (num != null) {
                    bVarCreate.f(-2).setTextColor(num.intValue());
                }
            }
        });
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }
}
