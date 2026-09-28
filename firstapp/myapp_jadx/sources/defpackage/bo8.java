package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public class bo8 extends Dialog implements ibs, nny, nv60 {
    public kbs a;
    public final kv60 b;
    public final iny c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo8(Context context, int i) {
        super(context, i);
        context.getClass();
        int i2 = 1;
        this.b = new kv60(new mv60(this, new xk20(this, i2)));
        this.c = new iny(new xi3(this, i2));
    }

    public static final void c(bo8 bo8Var) {
        super.onBackPressed();
    }

    public final kbs a() {
        kbs kbsVar = this.a;
        if (kbsVar != null) {
            return kbsVar;
        }
        kbs kbsVar2 = new kbs(this, true);
        this.a = kbsVar2;
        return kbsVar2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.ibs
    public final s9s getLifecycle() {
        return a();
    }

    @Override // defpackage.nny
    public final iny getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override // defpackage.nv60
    public final jv60 getSavedStateRegistry() {
        return this.b.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            iny inyVar = this.c;
            inyVar.getClass();
            inyVar.e = onBackInvokedDispatcher;
            inyVar.e(inyVar.g);
        }
        this.b.a(bundle);
        a().g(s9s.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a().g(s9s.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a().g(s9s.a.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.setContentView(view, layoutParams);
    }
}
