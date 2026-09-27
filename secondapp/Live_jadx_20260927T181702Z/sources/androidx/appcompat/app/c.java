package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.b1;
import k.c1;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c extends x implements DialogInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f6341h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f6342i = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AlertController f6343g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.f f6344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6345b;

        public a(@NonNull Context context) {
            this(context, c.h(context, 0));
        }

        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public a A(boolean z10) {
            this.f6344a.Q = z10;
            return this;
        }

        public a B(@k.e int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6213v = fVar.f6192a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.f6344a;
            fVar2.f6215x = onClickListener;
            fVar2.I = i11;
            fVar2.H = true;
            return this;
        }

        public a C(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.K = cursor;
            fVar.f6215x = onClickListener;
            fVar.I = i10;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        public a D(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6214w = listAdapter;
            fVar.f6215x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a E(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6213v = charSequenceArr;
            fVar.f6215x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a F(@b1 int i10) {
            AlertController.f fVar = this.f6344a;
            fVar.f6197f = fVar.f6192a.getText(i10);
            return this;
        }

        public a G(int i10) {
            AlertController.f fVar = this.f6344a;
            fVar.f6217z = null;
            fVar.f6216y = i10;
            fVar.E = false;
            return this;
        }

        @Deprecated
        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public a H(View view, int i10, int i11, int i12, int i13) {
            AlertController.f fVar = this.f6344a;
            fVar.f6217z = view;
            fVar.f6216y = 0;
            fVar.E = true;
            fVar.A = i10;
            fVar.B = i11;
            fVar.C = i12;
            fVar.D = i13;
            return this;
        }

        public c I() {
            c cVarCreate = create();
            cVarCreate.show();
            return cVarCreate;
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6214w = listAdapter;
            fVar.f6215x = onClickListener;
            return this;
        }

        public a b(boolean z10) {
            this.f6344a.f6209r = z10;
            return this;
        }

        public a c(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.f6344a;
            fVar.K = cursor;
            fVar.L = str;
            fVar.f6215x = onClickListener;
            return this;
        }

        @NonNull
        public c create() {
            c cVar = new c(this.f6344a.f6192a, this.f6345b);
            this.f6344a.a(cVar.f6343g);
            cVar.setCancelable(this.f6344a.f6209r);
            if (this.f6344a.f6209r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f6344a.f6210s);
            cVar.setOnDismissListener(this.f6344a.f6211t);
            DialogInterface.OnKeyListener onKeyListener = this.f6344a.f6212u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(@Nullable View view) {
            this.f6344a.f6198g = view;
            return this;
        }

        public a e(@k.u int i10) {
            this.f6344a.f6194c = i10;
            return this;
        }

        public a f(@Nullable Drawable drawable) {
            this.f6344a.f6195d = drawable;
            return this;
        }

        public a g(@k.f int i10) {
            TypedValue typedValue = new TypedValue();
            this.f6344a.f6192a.getTheme().resolveAttribute(i10, typedValue, true);
            this.f6344a.f6194c = typedValue.resourceId;
            return this;
        }

        @NonNull
        public Context getContext() {
            return this.f6344a.f6192a;
        }

        @Deprecated
        public a h(boolean z10) {
            this.f6344a.N = z10;
            return this;
        }

        public a i(@k.e int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6213v = fVar.f6192a.getResources().getTextArray(i10);
            this.f6344a.f6215x = onClickListener;
            return this;
        }

        public a j(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6213v = charSequenceArr;
            fVar.f6215x = onClickListener;
            return this;
        }

        public a k(@b1 int i10) {
            AlertController.f fVar = this.f6344a;
            fVar.f6199h = fVar.f6192a.getText(i10);
            return this;
        }

        public a l(@Nullable CharSequence charSequence) {
            this.f6344a.f6199h = charSequence;
            return this;
        }

        public a m(@k.e int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6213v = fVar.f6192a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.f6344a;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a n(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a o(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6213v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6203l = charSequence;
            fVar.f6205n = onClickListener;
            return this;
        }

        public a q(Drawable drawable) {
            this.f6344a.f6204m = drawable;
            return this;
        }

        public a r(@b1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6206o = fVar.f6192a.getText(i10);
            this.f6344a.f6208q = onClickListener;
            return this;
        }

        public a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6206o = charSequence;
            fVar.f6208q = onClickListener;
            return this;
        }

        public a setNegativeButton(@b1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6203l = fVar.f6192a.getText(i10);
            this.f6344a.f6205n = onClickListener;
            return this;
        }

        public a setPositiveButton(@b1 int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6200i = fVar.f6192a.getText(i10);
            this.f6344a.f6202k = onClickListener;
            return this;
        }

        public a setTitle(@Nullable CharSequence charSequence) {
            this.f6344a.f6197f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.f6344a;
            fVar.f6217z = view;
            fVar.f6216y = 0;
            fVar.E = false;
            return this;
        }

        public a t(Drawable drawable) {
            this.f6344a.f6207p = drawable;
            return this;
        }

        public a u(DialogInterface.OnCancelListener onCancelListener) {
            this.f6344a.f6210s = onCancelListener;
            return this;
        }

        public a v(DialogInterface.OnDismissListener onDismissListener) {
            this.f6344a.f6211t = onDismissListener;
            return this;
        }

        public a w(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f6344a.O = onItemSelectedListener;
            return this;
        }

        public a x(DialogInterface.OnKeyListener onKeyListener) {
            this.f6344a.f6212u = onKeyListener;
            return this;
        }

        public a y(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f6344a;
            fVar.f6200i = charSequence;
            fVar.f6202k = onClickListener;
            return this;
        }

        public a z(Drawable drawable) {
            this.f6344a.f6201j = drawable;
            return this;
        }

        public a(@NonNull Context context, @c1 int i10) {
            this.f6344a = new AlertController.f(new ContextThemeWrapper(context, c.h(context, i10)));
            this.f6345b = i10;
        }
    }

    public c(@NonNull Context context) {
        this(context, 0);
    }

    public static int h(@NonNull Context context, @c1 int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(m.a.b.N, typedValue, true);
        return typedValue.resourceId;
    }

    public Button f(int i10) {
        return this.f6343g.c(i10);
    }

    public ListView g() {
        return this.f6343g.e();
    }

    public void i(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f6343g.l(i10, charSequence, onClickListener, null, null);
    }

    public void j(int i10, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f6343g.l(i10, charSequence, onClickListener, null, drawable);
    }

    public void k(int i10, CharSequence charSequence, Message message) {
        this.f6343g.l(i10, charSequence, null, message, null);
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public void l(int i10) {
        this.f6343g.m(i10);
    }

    public void m(View view) {
        this.f6343g.n(view);
    }

    public void n(int i10) {
        this.f6343g.o(i10);
    }

    public void o(Drawable drawable) {
        this.f6343g.p(drawable);
    }

    @Override // androidx.appcompat.app.x, androidx.activity.s, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6343g.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f6343g.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f6343g.i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void p(int i10) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i10, typedValue, true);
        this.f6343g.o(typedValue.resourceId);
    }

    public void q(CharSequence charSequence) {
        this.f6343g.q(charSequence);
    }

    public void r(View view) {
        this.f6343g.u(view);
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f6343g.v(view, i10, i11, i12, i13);
    }

    @Override // androidx.appcompat.app.x, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f6343g.s(charSequence);
    }

    public c(@NonNull Context context, @c1 int i10) {
        super(context, h(context, i10));
        this.f6343g = new AlertController(getContext(), this, getWindow());
    }

    public c(@NonNull Context context, boolean z10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }
}
