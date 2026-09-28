package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class jd extends zgx<id.a> {
    public Context i;
    public dq7 j;

    @Override // defpackage.zgx
    public final ygx a() {
        id.a aVar = (id.a) super.a();
        Intent intent = aVar.i;
        if (intent == null) {
            intent = new Intent();
            aVar.i = intent;
        }
        intent.setPackage(null);
        dq7 dq7Var = this.j;
        if (dq7Var != null) {
            ComponentName componentName = new ComponentName(this.i, (Class<?>) tgp.b(dq7Var));
            Intent intent2 = aVar.i;
            if (intent2 == null) {
                intent2 = new Intent();
                aVar.i = intent2;
            }
            intent2.setComponent(componentName);
        }
        Intent intent3 = aVar.i;
        if (intent3 == null) {
            intent3 = new Intent();
            aVar.i = intent3;
        }
        intent3.setAction(null);
        Intent intent4 = aVar.i;
        if (intent4 == null) {
            intent4 = new Intent();
            aVar.i = intent4;
        }
        intent4.setData(null);
        aVar.v = null;
        return aVar;
    }
}
