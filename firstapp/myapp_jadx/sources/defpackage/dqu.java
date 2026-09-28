package defpackage;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dqu implements MultiItemEntity {
    public final int a;
    public final String b;
    public final String c;
    public final spu d;
    public List<spu> e;
    public final v1v f;
    public Boolean i = Boolean.FALSE;

    /* JADX INFO: loaded from: classes5.dex */
    public interface a {
        void F0(bs3 bs3Var, Event event, ArrayList arrayList);

        void z0(bs3 bs3Var, ArrayList arrayList);
    }

    public interface b {
        void f(bs3 bs3Var);

        void g(bs3 bs3Var);
    }

    public dqu(String str, int i, String str2, spu spuVar, v1v v1vVar) {
        this.b = str;
        this.a = i;
        this.c = str2;
        this.d = spuVar;
        this.f = v1vVar;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public final int getItemType() {
        return this.a;
    }

    public dqu() {
    }
}
