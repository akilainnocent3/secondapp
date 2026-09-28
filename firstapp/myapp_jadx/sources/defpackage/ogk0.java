package defpackage;

import android.os.Looper;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.a;

/* JADX INFO: loaded from: classes4.dex */
public final class ogk0 extends wfk0 {
    public final u4l b;

    public ogk0(u4l u4lVar) {
        this.b = u4lVar;
    }

    @Override // defpackage.x4l
    public final Looper a() {
        return this.b.f;
    }

    public final a b(vkk0 vkk0Var) {
        u4l u4lVar = this.b;
        u4lVar.getClass();
        boolean z = true;
        if (!vkk0Var.i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        vkk0Var.i = z;
        y4l y4lVar = u4lVar.j;
        y4lVar.getClass();
        bhk0 bhk0Var = new bhk0(new thk0(vkk0Var), y4lVar.w.get(), u4lVar);
        ljk0 ljk0Var = y4lVar.C;
        ljk0Var.sendMessage(ljk0Var.obtainMessage(4, bhk0Var));
        return vkk0Var;
    }
}
