package defpackage;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sr implements y16 {
    public final ArrayList a;

    public sr(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.y16
    public final y16.a a(SessionConfiguration sessionConfiguration) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y16.a aVarA = ((y16) obj).a(sessionConfiguration);
            if (aVarA.a != 0) {
                return aVarA;
            }
        }
        return new y16.a(0);
    }
}
