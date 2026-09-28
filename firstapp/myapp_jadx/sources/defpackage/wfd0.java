package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import defpackage.g6i0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B3\u0012*\u0010\n\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwfd0;", "Lg6i0;", "VB", "Landroidx/fragment/app/Fragment;", "", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lcom/sportybet/android/base/Inflate;", "inflate", "<init>", "(Lgaj;)V", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class wfd0<VB extends g6i0> extends Fragment {
    public final gaj<LayoutInflater, ViewGroup, Boolean, VB> a;
    public VB b;
    public Toast c;
    public final ee<Intent> d;

    /* JADX WARN: Multi-variable type inference failed */
    public wfd0(gaj<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> gajVar) {
        gajVar.getClass();
        this.a = gajVar;
        ee eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: vfd0
            @Override // defpackage.ud
            public final void a(Object obj) {
                ((ActivityResult) obj).getClass();
                wfd0 wfd0Var = this.a;
                if (new t2y(wfd0Var.requireContext()).b.areNotificationsEnabled()) {
                    wfd0Var.m0();
                } else {
                    wfd0Var.j0();
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.d = eeVarRegisterForActivityResult;
    }

    public abstract void j0();

    public abstract void m0();

    public final void n0(String str) {
        Toast toast = this.c;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(getContext(), str, 0);
        this.c = toastMakeText;
        if (toastMakeText != null) {
            toastMakeText.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        VB vbInvoke = this.a.invoke(layoutInflater, viewGroup, Boolean.FALSE);
        this.b = vbInvoke;
        vbInvoke.getClass();
        return vbInvoke.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }
}
