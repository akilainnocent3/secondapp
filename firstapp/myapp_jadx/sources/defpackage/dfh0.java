package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class dfh0 implements php<Unit> {
    public static final dfh0 b = new dfh0();
    public final /* synthetic */ mcy<Unit> a = new mcy<>(Unit.a, "kotlin.Unit");

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        this.a.deserialize(b5dVar);
        return Unit.a;
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        Unit unit = (Unit) obj;
        unit.getClass();
        this.a.serialize(f4gVar, unit);
    }
}
