package n9;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends k implements m9.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final SQLiteStatement f116418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@oy.l SQLiteStatement delegate) {
        super(delegate);
        m0.p(delegate, "delegate");
        this.f116418c = delegate;
    }

    @Override // m9.j
    public int C() {
        return this.f116418c.executeUpdateDelete();
    }

    @Override // m9.j
    @oy.m
    public String X0() {
        return this.f116418c.simpleQueryForString();
    }

    @Override // m9.j
    public long Z() {
        return this.f116418c.simpleQueryForLong();
    }

    @Override // m9.j
    public void execute() {
        this.f116418c.execute();
    }

    @Override // m9.j
    public long p1() {
        return this.f116418c.executeInsert();
    }
}
