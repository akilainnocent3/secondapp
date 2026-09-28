package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i5a0 implements Iterable<Long>, dhp {
    public static final i5a0 e = new i5a0(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    @c0d(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend")
    public static final class a extends ji50 implements Function2<wc80<? super Long>, v1b<? super Unit>, Object> {
        public long[] b;
        public int c;
        public int d;
        public int e;
        public /* synthetic */ Object f;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = i5a0.this.new a(v1bVar);
            aVar.f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wc80<? super Long> wc80Var, v1b<? super Unit> v1bVar) {
            return ((a) create(wc80Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007c  */
        /* JADX WARN: Code duplicated, block: B:24:0x0084  */
        /* JADX WARN: Code duplicated, block: B:27:0x009b  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:26:0x0099). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x009b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i5a0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i5a0(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final i5a0 b(i5a0 i5a0Var) {
        long[] jArr;
        i5a0 i5a0VarC = this;
        i5a0 i5a0Var2 = e;
        if (i5a0Var == i5a0Var2) {
            return i5a0VarC;
        }
        if (i5a0VarC == i5a0Var2) {
            return i5a0Var2;
        }
        long j = i5a0Var.c;
        long j2 = i5a0Var.c;
        long[] jArr2 = i5a0Var.d;
        long j3 = i5a0Var.b;
        long j4 = i5a0Var.a;
        long j5 = i5a0VarC.c;
        if (j == j5 && jArr2 == (jArr = i5a0VarC.d)) {
            return new i5a0(i5a0VarC.a & (~j4), i5a0VarC.b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                i5a0VarC = i5a0VarC.c(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    i5a0VarC = i5a0VarC.c(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    i5a0VarC = i5a0VarC.c(((long) i2) + j2 + 64);
                }
            }
        }
        return i5a0VarC;
    }

    public final i5a0 c(long j) {
        long[] jArr;
        int iB;
        long[] jArr2;
        long j2 = j - this.c;
        if (Intrinsics.i(j2, 0L) >= 0 && Intrinsics.i(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new i5a0(this.a, j4 & (~j3), this.c, this.d);
            }
        } else if (Intrinsics.i(j2, 64L) >= 0 && Intrinsics.i(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new i5a0(j6 & (~j5), this.b, this.c, this.d);
            }
        } else if (Intrinsics.i(j2, 0L) < 0 && (jArr = this.d) != null && (iB = fe10.b(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iB > 0) {
                    xx0.g(jArr, jArr3, 0, 0, iB);
                }
                if (iB < i) {
                    xx0.g(jArr, jArr3, iB, iB + 1, length);
                }
                jArr2 = jArr3;
            }
            return new i5a0(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.c;
        if (Intrinsics.i(j2, 0L) >= 0 && Intrinsics.i(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.b) != 0;
        }
        if (Intrinsics.i(j2, 64L) < 0 || Intrinsics.i(j2, 128L) >= 0) {
            return Intrinsics.i(j2, 0L) <= 0 && (jArr = this.d) != null && fe10.b(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.a) != 0;
    }

    public final i5a0 e(i5a0 i5a0Var) {
        i5a0 i5a0VarF;
        long[] jArr;
        i5a0 i5a0VarF2 = this;
        i5a0 i5a0Var2 = e;
        if (i5a0Var == i5a0Var2) {
            return i5a0VarF2;
        }
        if (i5a0VarF2 == i5a0Var2) {
            return i5a0Var;
        }
        long j = i5a0Var.c;
        long j2 = i5a0Var.c;
        long[] jArr2 = i5a0Var.d;
        long j3 = i5a0Var.b;
        long j4 = i5a0Var.a;
        long j5 = i5a0VarF2.c;
        long j6 = i5a0VarF2.b;
        long j7 = i5a0VarF2.a;
        if (j == j5 && jArr2 == (jArr = i5a0VarF2.d)) {
            return new i5a0(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = i5a0VarF2.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    i5a0VarF2 = i5a0VarF2.f(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        i5a0VarF2 = i5a0VarF2.f(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        i5a0VarF2 = i5a0VarF2.f(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return i5a0VarF2;
        }
        if (jArr3 != null) {
            i5a0VarF = i5a0Var;
            for (long j9 : jArr3) {
                i5a0VarF = i5a0VarF.f(j9);
            }
        } else {
            i5a0VarF = i5a0Var;
        }
        long j10 = i5a0VarF2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    i5a0VarF = i5a0VarF.f(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    i5a0VarF = i5a0VarF.f(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return i5a0VarF;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    public final i5a0 f(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4 = this.c;
        long j5 = j - j4;
        long j6 = 0;
        int i2 = Intrinsics.i(j5, 0L);
        long j7 = this.b;
        if (i2 < 0 || Intrinsics.i(j5, 64L) >= 0) {
            int i3 = Intrinsics.i(j5, 64L);
            long j8 = this.a;
            int i4 = 64;
            if (i3 < 0 || Intrinsics.i(j5, 128L) >= 0) {
                int i5 = Intrinsics.i(j5, 128L);
                long[] jArr3 = this.d;
                if (i5 < 0) {
                    if (jArr3 == null) {
                        return new i5a0(this.a, this.b, this.c, new long[]{j});
                    }
                    int iB = fe10.b(jArr3, j);
                    if (iB < 0) {
                        int i6 = -(iB + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        xx0.g(jArr3, jArr4, 0, 0, i6);
                        xx0.g(jArr3, jArr4, i6 + 1, i6, length);
                        jArr4[i6] = j;
                        return new i5a0(this.a, this.b, this.c, jArr4);
                    }
                } else if (!d(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (Intrinsics.i(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    h5a0 h5a0Var = null;
                    while (true) {
                        if (Intrinsics.i(j4, j9) >= 0) {
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (h5a0Var == null) {
                                h5a0Var = new h5a0(jArr3);
                            }
                            int i7 = 0;
                            i = i4;
                            while (i7 < i) {
                                if ((j7 & (1 << i7)) != j6) {
                                    h5a0Var.a.a(((long) i7) + j4);
                                }
                                i7++;
                                j6 = j6;
                            }
                        } else {
                            i = i4;
                        }
                        long j11 = j6;
                        if (j10 == j11) {
                            j2 = j9;
                            j3 = j11;
                            break;
                        }
                        j4 += 64;
                        j6 = j11;
                        j7 = j10;
                        i4 = i;
                        j10 = j6;
                    }
                    if (h5a0Var == null) {
                        jArr = jArr3;
                    } else {
                        usw uswVar = h5a0Var.a;
                        int i8 = uswVar.b;
                        if (i8 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i8];
                            long[] jArr6 = uswVar.a;
                            for (int i9 = 0; i9 < i8; i9++) {
                                jArr5[i9] = jArr6[i9];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 == null) {
                            jArr = jArr3;
                        } else {
                            jArr = jArr2;
                        }
                    }
                    return new i5a0(j10, j3, j2, jArr).f(j);
                }
            } else {
                long j12 = 1 << (((int) j5) - 64);
                if ((j8 & j12) == 0) {
                    return new i5a0(j8 | j12, this.b, this.c, this.d);
                }
            }
        } else {
            long j13 = 1 << ((int) j5);
            if ((j7 & j13) == 0) {
                return new i5a0(this.a, j7 | j13, this.c, this.d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return zc80.a(new a(null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(l48.r(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
