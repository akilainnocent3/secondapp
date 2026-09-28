package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ke extends ee<Object> {
    public final /* synthetic */ ie a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vd<Object, Object> c;

    public ke(ie ieVar, String str, vd<Object, Object> vdVar) {
        this.a = ieVar;
        this.b = str;
        this.c = vdVar;
    }

    @Override // defpackage.ee
    public final vd<Object, ?> a() {
        return this.c;
    }

    @Override // defpackage.ee
    public final void b(Object obj) throws Exception {
        ie ieVar = this.a;
        LinkedHashMap linkedHashMap = ieVar.b;
        ArrayList arrayList = ieVar.d;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        vd<Object, Object> vdVar = this.c;
        if (obj2 == null) {
            ruw.b(vdVar, "Attempting to launch an unregistered ActivityResultLauncher with contract ", " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            return;
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            ieVar.b(iIntValue, vdVar, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
