package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class fh50 implements bpu<Integer, kmh0> {
    @Override // defpackage.bpu
    public final kmh0 a(Object obj, u2z u2zVar) {
        int iIntValue = ((Number) obj).intValue();
        Context context = u2zVar.a;
        try {
            if (context.getResources().getResourceEntryName(iIntValue) == null) {
                return null;
            }
            return tl9.f("android.resource://" + context.getPackageName() + '/' + iIntValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
