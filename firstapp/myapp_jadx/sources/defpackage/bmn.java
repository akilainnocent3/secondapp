package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@fae
public final class bmn {
    public final View a;
    public final ttr b = hwr.a(a1s.c, new a());
    public final qoa0 c;

    public static final class a extends qlr implements Function0<InputMethodManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InputMethodManager invoke() {
            Object systemService = bmn.this.a.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    }

    public bmn(View view) {
        this.a = view;
        this.c = new qoa0(view);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ((InputMethodManager) this.b.getValue()).updateSelection(this.a, i, i2, i3, i4);
    }
}
