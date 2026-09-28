package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.db.ShortcutDao", f = "ShortcutDao.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER, 35}, m = "replaceAllHomeShortcuts$suspendImpl", v = 2)
public final class g690 extends x1b {
    public h690 a;
    public ArrayList b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ h690 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g690(h690 h690Var, x1b x1bVar) {
        super(x1bVar);
        this.e = h690Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return h690.f(this.e, null, this);
    }
}
