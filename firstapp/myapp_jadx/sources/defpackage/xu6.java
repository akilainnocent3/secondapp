package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class xu6 implements kee0 {
    public final ArrayDeque<a> a = new ArrayDeque<>();
    public final ArrayDeque<oee0> b;
    public final ArrayDeque<a> c;
    public a d;
    public long e;
    public long f;
    public long g;

    public static final class a extends nee0 implements Comparable<a> {
        public long y;

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (i(4) != aVar2.i(4)) {
                return i(4) ? 1 : -1;
            }
            long j = this.f - aVar2.f;
            if (j == 0) {
                j = this.y - aVar2.y;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class b extends oee0 {
        public wu6 f;

        @Override // defpackage.h5d
        public final void k() {
            xu6 xu6Var = (xu6) this.f.a;
            j();
            xu6Var.b.add(this);
        }
    }

    public xu6() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new a());
        }
        this.b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque<oee0> arrayDeque = this.b;
            wu6 wu6Var = new wu6(this);
            b bVar = new b();
            bVar.f = wu6Var;
            arrayDeque.add(bVar);
        }
        this.c = new ArrayDeque<>();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.kee0
    public final void a(long j) {
        this.e = j;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    @Override // defpackage.c5d
    public final void c(nee0 nee0Var) {
        ly0.b(nee0Var == this.d);
        a aVar = (a) nee0Var;
        if (aVar.i(4)) {
            long j = this.f;
            this.f = 1 + j;
            aVar.y = j;
            this.c.add(aVar);
        } else {
            long j2 = aVar.f;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.g;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f;
                    this.f = 1 + j4;
                    aVar.y = j4;
                    this.c.add(aVar);
                } else {
                    aVar.j();
                    this.a.add(aVar);
                }
            } else {
                long j5 = this.f;
                this.f = 1 + j5;
                aVar.y = j5;
                this.c.add(aVar);
            }
        }
        this.d = null;
    }

    @Override // defpackage.c5d
    public final void d(long j) {
        this.g = j;
    }

    @Override // defpackage.c5d
    public final nee0 e() {
        ly0.f(this.d == null);
        ArrayDeque<a> arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        a aVarPollFirst = arrayDeque.pollFirst();
        this.d = aVarPollFirst;
        return aVarPollFirst;
    }

    @Override // defpackage.c5d
    public void flush() {
        ArrayDeque<a> arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            a aVarPoll = arrayDeque2.poll();
            String str = jrh0.a;
            aVarPoll.j();
            arrayDeque.add(aVarPoll);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
            arrayDeque.add(aVar);
            this.d = null;
        }
    }

    public abstract yu6 g();

    public abstract void h(a aVar);

    @Override // defpackage.c5d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public oee0 b() {
        ArrayDeque<oee0> arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque<a> arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            a aVarPeek = arrayDeque2.peek();
            String str = jrh0.a;
            if (aVarPeek.f > this.e) {
                return null;
            }
            a aVarPoll = arrayDeque2.poll();
            boolean zI = aVarPoll.i(4);
            ArrayDeque<a> arrayDeque3 = this.a;
            if (zI) {
                oee0 oee0VarPollFirst = arrayDeque.pollFirst();
                oee0VarPollFirst.e(4);
                aVarPoll.j();
                arrayDeque3.add(aVarPoll);
                return oee0VarPollFirst;
            }
            h(aVarPoll);
            if (j()) {
                yu6 yu6VarG = g();
                oee0 oee0VarPollFirst2 = arrayDeque.pollFirst();
                long j = aVarPoll.f;
                oee0VarPollFirst2.b = j;
                oee0VarPollFirst2.d = yu6VarG;
                oee0VarPollFirst2.e = j;
                aVarPoll.j();
                arrayDeque3.add(aVarPoll);
                return oee0VarPollFirst2;
            }
            aVarPoll.j();
            arrayDeque3.add(aVarPoll);
        }
    }

    public abstract boolean j();

    @Override // defpackage.c5d
    public void release() {
    }
}
