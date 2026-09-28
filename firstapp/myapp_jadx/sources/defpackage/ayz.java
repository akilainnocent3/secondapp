package defpackage;

import com.sporty.android.core.model.patron.LogoutDeviceRequest;
import com.sporty.android.core.model.patron.TooltipType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class ayz implements zxz {
    public final xxz a;

    public ayz(xxz xxzVar) {
        xxzVar.getClass();
        this.a = xxzVar;
    }

    @Override // defpackage.zxz
    public final Object a(ArrayList arrayList, int i, int i2, eyz eyzVar) {
        return this.a.V(arrayList, i, i2, eyzVar);
    }

    @Override // defpackage.zxz
    public final Object b(gyz gyzVar) {
        return this.a.u1(gyzVar);
    }

    @Override // defpackage.zxz
    public final Object c(TooltipType tooltipType, cyz cyzVar) {
        return this.a.Y(tooltipType.getValue(), cyzVar);
    }

    @Override // defpackage.zxz
    public final Object d(dyz dyzVar) {
        return this.a.J(dyzVar);
    }

    @Override // defpackage.zxz
    public final Object e(LogoutDeviceRequest logoutDeviceRequest, fyz fyzVar) {
        return this.a.h1(logoutDeviceRequest, fyzVar);
    }
}
