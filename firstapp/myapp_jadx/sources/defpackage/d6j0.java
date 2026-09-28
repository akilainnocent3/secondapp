package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d6j0 extends Dialog {
    public FloatingActionButton a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public ImageView f;
    public ImageView i;
    public ImageView v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6j0(Context context) {
        super(context);
        context.getClass();
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    public final void a() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.gravity = 17;
        }
        if (attributes != null) {
            attributes.flags &= -5;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawableResource(R.color.trans_black_45);
        }
        show();
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            setContentView(R.layout.pp_what_provably_fair);
            View viewFindViewById = findViewById(R.id.close);
            viewFindViewById.getClass();
            this.a = (FloatingActionButton) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.title);
            viewFindViewById2.getClass();
            this.b = (TextView) viewFindViewById2;
            View viewFindViewById3 = findViewById(R.id.text1);
            viewFindViewById3.getClass();
            this.c = (TextView) viewFindViewById3;
            View viewFindViewById4 = findViewById(R.id.text2);
            viewFindViewById4.getClass();
            this.d = (TextView) viewFindViewById4;
            View viewFindViewById5 = findViewById(R.id.text3);
            viewFindViewById5.getClass();
            this.e = (TextView) viewFindViewById5;
            View viewFindViewById6 = findViewById(R.id.image1);
            viewFindViewById6.getClass();
            this.f = (ImageView) viewFindViewById6;
            View viewFindViewById7 = findViewById(R.id.image2);
            viewFindViewById7.getClass();
            this.i = (ImageView) viewFindViewById7;
            View viewFindViewById8 = findViewById(R.id.image3);
            viewFindViewById8.getClass();
            this.v = (ImageView) viewFindViewById8;
            FloatingActionButton floatingActionButton = this.a;
            if (floatingActionButton == null) {
                Intrinsics.n("closeButton");
                throw null;
            }
            floatingActionButton.setOnClickListener(new sn60(this, 1));
            op5 op5Var = op5.a;
            TextView textView = this.b;
            if (textView == null) {
                Intrinsics.n("title");
                throw null;
            }
            op5.r(op5Var, b.f(textView), null, 4);
            TextView textView2 = this.c;
            if (textView2 == null) {
                Intrinsics.n("text1");
                throw null;
            }
            TextView textView3 = this.d;
            if (textView3 == null) {
                Intrinsics.n("text2");
                throw null;
            }
            TextView textView4 = this.e;
            if (textView4 == null) {
                Intrinsics.n("text3");
                throw null;
            }
            ArrayList arrayListF = b.f(textView2, textView3, textView4);
            ImageView imageView = this.f;
            if (imageView == null) {
                Intrinsics.n("image1");
                throw null;
            }
            ImageView imageView2 = this.i;
            if (imageView2 == null) {
                Intrinsics.n("image2");
                throw null;
            }
            ImageView imageView3 = this.v;
            if (imageView3 == null) {
                Intrinsics.n("image3");
                throw null;
            }
            ArrayList arrayListF2 = b.f(imageView, imageView2, imageView3);
            ArrayList arrayListF3 = b.f(getContext().getDrawable(R.drawable.what_provably_1), getContext().getDrawable(R.drawable.what_provably_2), getContext().getDrawable(R.drawable.what_provably_3));
            Context context = getContext();
            context.getClass();
            op5.m(arrayListF, arrayListF2, arrayListF3, context);
        } catch (Exception unused) {
            dismiss();
        }
    }
}
