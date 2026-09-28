package defpackage;

import android.view.View;
import android.widget.EditText;
import com.sportybet.android.account.international.login.INTLoginFragment;

/* JADX INFO: loaded from: classes5.dex */
public final class vvm implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ INTLoginFragment b;
    public final /* synthetic */ dwo c;

    public vvm(cq40 cq40Var, INTLoginFragment iNTLoginFragment, dwo dwoVar) {
        this.a = cq40Var;
        this.b = iNTLoginFragment;
        this.c = dwoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        ohp<Object>[] ohpVarArr = INTLoginFragment.E;
        INTLoginFragment iNTLoginFragment = this.b;
        dwm dwmVarR0 = iNTLoginFragment.r0();
        dwo dwoVar = this.c;
        String strA = auf.a(dwoVar.e);
        EditText passwordView = dwoVar.y.getPasswordView();
        passwordView.getClass();
        r5b r5bVarX1 = dwmVarR0.x1(strA, auf.a(passwordView));
        ibs viewLifecycleOwner = iNTLoginFragment.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        r5bVarX1.f(viewLifecycleOwner, new tvm(new wvm(r5bVarX1, viewLifecycleOwner, iNTLoginFragment)));
    }
}
