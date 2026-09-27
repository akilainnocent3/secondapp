package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q20 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f154236b = 0;

    static {
        m51 m51Var = p51.f153747c;
        new q20(sm2.f155489f);
        new wq() { // from class: yads.v84
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return q20.a(bundle);
            }
        };
    }

    public q20(List list) {
        p51.a((Collection) list);
    }

    public static final q20 a(Bundle bundle) {
        sm2 sm2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m51 m51Var = p51.f153747c;
            sm2VarA = sm2.f155489f;
        } else {
            sm2VarA = yq.a(o20.f153317t, parcelableArrayList);
        }
        return new q20(sm2VarA);
    }
}
