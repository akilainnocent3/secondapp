package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Build;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class h41 {
    public boolean A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public vs7 F;
    public final tad.j a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public f41 e;
    public int f;
    public long g;
    public float h;
    public boolean i;
    public long j;
    public int k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public int v;
    public long w;
    public long x;
    public long y;
    public long z;

    public h41(tad.j jVar) {
        this.a = jVar;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.C = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.F = vs7.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:103:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:112:0x0301  */
    /* JADX WARN: Code duplicated, block: B:127:0x0364  */
    /* JADX WARN: Code duplicated, block: B:129:0x0367  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:39:0x010b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0117  */
    /* JADX WARN: Code duplicated, block: B:42:0x012d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:46:0x015a  */
    /* JADX WARN: Code duplicated, block: B:47:0x019d  */
    /* JADX WARN: Code duplicated, block: B:49:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0201  */
    /* JADX WARN: Code duplicated, block: B:60:0x0204  */
    /* JADX WARN: Code duplicated, block: B:62:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x020b  */
    /* JADX WARN: Code duplicated, block: B:66:0x020f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0211  */
    /* JADX WARN: Code duplicated, block: B:68:0x0217  */
    /* JADX WARN: Code duplicated, block: B:70:0x021a  */
    /* JADX WARN: Code duplicated, block: B:71:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0221  */
    /* JADX WARN: Code duplicated, block: B:75:0x022a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0255  */
    /* JADX WARN: Code duplicated, block: B:78:0x025a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0264  */
    /* JADX WARN: Code duplicated, block: B:81:0x0269  */
    /* JADX WARN: Code duplicated, block: B:82:0x0276  */
    /* JADX WARN: Code duplicated, block: B:83:0x027b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0280  */
    /* JADX WARN: Code duplicated, block: B:87:0x028a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0297  */
    /* JADX WARN: Code duplicated, block: B:90:0x029e  */
    /* JADX WARN: Code duplicated, block: B:96:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c2  */
    public final long a() {
        AudioTrack audioTrack;
        long j;
        long j2;
        boolean z;
        long jNanoTime;
        f41 f41Var;
        long jC;
        long j3;
        int playState;
        long j4;
        long j5;
        long j6;
        long jZ;
        long j7;
        int i;
        long j8;
        f41 f41Var2;
        tad.j jVar;
        int i2;
        f41.a aVar;
        float f;
        long jC2;
        AudioTimestamp audioTimestamp;
        boolean timestamp;
        AudioTimestamp audioTimestamp2;
        float f2;
        int i3;
        int i4;
        AudioTimestamp audioTimestamp3;
        long j9;
        long j10;
        long j11;
        float f3;
        long j12;
        long jZ2;
        long j13;
        long j14;
        Method method;
        AudioTrack audioTrack2 = this.c;
        audioTrack2.getClass();
        long j15 = 1000;
        if (audioTrack2.getPlayState() == 3) {
            long jNanoTime2 = this.F.nanoTime() / 1000;
            if (jNanoTime2 - this.m >= 30000) {
                long jT = jrh0.T(this.f, b());
                if (jT == 0) {
                    audioTrack = audioTrack2;
                    j = 1000;
                    j2 = 0;
                } else {
                    int i5 = this.u;
                    long jB = jrh0.B(this.h, jT) - jNanoTime2;
                    long[] jArr = this.b;
                    jArr[i5] = jB;
                    this.u = (this.u + 1) % 10;
                    int i6 = this.v;
                    if (i6 < 10) {
                        this.v = i6 + 1;
                    }
                    this.m = jNanoTime2;
                    this.l = 0L;
                    int i7 = 0;
                    while (true) {
                        int i8 = this.v;
                        if (i7 >= i8) {
                            break;
                        }
                        this.l = (jArr[i7] / ((long) i8)) + this.l;
                        i7++;
                        j15 = j15;
                    }
                    j = j15;
                    if (this.p || (method = this.n) == null) {
                        j8 = 5000000;
                    } else {
                        j8 = 5000000;
                        if (jNanoTime2 - this.q >= 500000) {
                            try {
                                AudioTrack audioTrack3 = this.c;
                                audioTrack3.getClass();
                                Integer num = (Integer) method.invoke(audioTrack3, null);
                                String str = jrh0.a;
                                long jIntValue = (((long) num.intValue()) * j) - this.g;
                                this.o = jIntValue;
                                long jMax = Math.max(jIntValue, 0L);
                                this.o = jMax;
                                if (jMax > 5000000) {
                                    cft.g("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                    this.o = 0L;
                                }
                            } catch (Exception unused) {
                                this.n = null;
                            }
                            this.q = jNanoTime2;
                        }
                    }
                    f41Var2 = this.e;
                    f41Var2.getClass();
                    jVar = f41Var2.c;
                    i2 = f41Var2.b;
                    aVar = f41Var2.a;
                    f = this.h;
                    j2 = 0;
                    jC2 = c(jNanoTime2);
                    if (jNanoTime2 - f41Var2.g < f41Var2.f) {
                        audioTrack = audioTrack2;
                    } else {
                        f41Var2.g = jNanoTime2;
                        AudioTrack audioTrack4 = aVar.a;
                        audioTimestamp = aVar.b;
                        timestamp = audioTrack4.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            j13 = audioTimestamp.framePosition;
                            audioTrack = audioTrack2;
                            j14 = aVar.d;
                            if (j14 > j13) {
                                if (aVar.f) {
                                    aVar.g += j14;
                                    aVar.f = false;
                                } else {
                                    aVar.c++;
                                }
                            }
                            aVar.d = j13;
                            aVar.e = j13 + aVar.g + (aVar.c << 32);
                        } else {
                            audioTrack = audioTrack2;
                        }
                        if (timestamp != 0) {
                            j12 = audioTimestamp.nanoTime / j;
                            audioTimestamp2 = audioTimestamp;
                            jZ2 = jrh0.z(f, jNanoTime2 - (aVar.b.nanoTime / j)) + jrh0.T(i2, aVar.e);
                            if (Math.abs(j12 - jNanoTime2) > j8) {
                                long j16 = aVar.e;
                                jVar.getClass();
                                StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                                sb.append(j16);
                                sb.append(", ");
                                sb.append(j12);
                                g41.a(jNanoTime2, ", ", ", ", sb);
                                sb.append(jC2);
                                sb.append(", ");
                                tad tadVar = tad.this;
                                sb.append(tadVar.j());
                                sb.append(", ");
                                sb.append(tadVar.k());
                                cft.g("DefaultAudioSink", sb.toString());
                                i3 = 4;
                                f41Var2.a(4);
                                f2 = f;
                            } else if (Math.abs(jZ2 - jC2) > j8) {
                                long j17 = aVar.e;
                                jVar.getClass();
                                f2 = f;
                                StringBuilder sb2 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(j17);
                                sb2.append(", ");
                                sb2.append(j12);
                                g41.a(jNanoTime2, ", ", ", ", sb2);
                                sb2.append(jC2);
                                sb2.append(", ");
                                tad tadVar2 = tad.this;
                                sb2.append(tadVar2.j());
                                sb2.append(", ");
                                sb2.append(tadVar2.k());
                                cft.g("DefaultAudioSink", sb2.toString());
                                i3 = 4;
                                f41Var2.a(4);
                            } else {
                                f2 = f;
                                i3 = 4;
                                if (f41Var2.d == 4) {
                                    f41Var2.a(0);
                                }
                            }
                        } else {
                            audioTimestamp2 = audioTimestamp;
                            f2 = f;
                            i3 = 4;
                        }
                        i4 = f41Var2.d;
                        if (i4 != 0) {
                            audioTimestamp3 = audioTimestamp2;
                            z = false;
                            if (timestamp != 0) {
                                j9 = audioTimestamp3.nanoTime;
                                if (j9 / j >= f41Var2.e) {
                                    f41Var2.h = aVar.e;
                                    f41Var2.i = j9 / j;
                                    f41Var2.a(1);
                                }
                            } else if (jNanoTime2 - f41Var2.e > 500000) {
                                f41Var2.a(3);
                            }
                        } else if (i4 != 1) {
                            if (i4 != 2) {
                                z = false;
                                if (timestamp == 0) {
                                    f41Var2.a(0);
                                }
                            } else if (i4 != 3) {
                                if (i4 != i3) {
                                    fm20.a();
                                    return 0L;
                                }
                            } else if (timestamp) {
                                z = false;
                                f41Var2.a(0);
                            }
                        } else if (timestamp != 0) {
                            j10 = aVar.e;
                            j11 = f41Var2.h;
                            if (j10 <= j11) {
                                f3 = f2;
                                if (Math.abs((jrh0.z(f3, jNanoTime2 - (aVar.b.nanoTime / j)) + jrh0.T(i2, aVar.e)) - (jrh0.z(f3, jNanoTime2 - f41Var2.i) + jrh0.T(i2, j11))) < j) {
                                    f41Var2.a(2);
                                } else if (jNanoTime2 - f41Var2.e > 2000000) {
                                    f41Var2.a(3);
                                } else {
                                    f41Var2.h = aVar.e;
                                    f41Var2.i = audioTimestamp2.nanoTime / j;
                                }
                            } else if (jNanoTime2 - f41Var2.e > 2000000) {
                                f41Var2.a(3);
                            } else {
                                f41Var2.h = aVar.e;
                                f41Var2.i = audioTimestamp2.nanoTime / j;
                            }
                        } else {
                            z = false;
                            f41Var2.a(0);
                        }
                    }
                }
            } else {
                j = j15;
                if (this.p) {
                    j8 = 5000000;
                } else {
                    j8 = 5000000;
                }
                f41Var2 = this.e;
                f41Var2.getClass();
                jVar = f41Var2.c;
                i2 = f41Var2.b;
                aVar = f41Var2.a;
                f = this.h;
                j2 = 0;
                jC2 = c(jNanoTime2);
                if (jNanoTime2 - f41Var2.g < f41Var2.f) {
                    audioTrack = audioTrack2;
                } else {
                    f41Var2.g = jNanoTime2;
                    AudioTrack audioTrack5 = aVar.a;
                    audioTimestamp = aVar.b;
                    timestamp = audioTrack5.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j13 = audioTimestamp.framePosition;
                        audioTrack = audioTrack2;
                        j14 = aVar.d;
                        if (j14 > j13) {
                            if (aVar.f) {
                                aVar.g += j14;
                                aVar.f = false;
                            } else {
                                aVar.c++;
                            }
                        }
                        aVar.d = j13;
                        aVar.e = j13 + aVar.g + (aVar.c << 32);
                    } else {
                        audioTrack = audioTrack2;
                    }
                    if (timestamp != 0) {
                        j12 = audioTimestamp.nanoTime / j;
                        audioTimestamp2 = audioTimestamp;
                        jZ2 = jrh0.z(f, jNanoTime2 - (aVar.b.nanoTime / j)) + jrh0.T(i2, aVar.e);
                        if (Math.abs(j12 - jNanoTime2) > j8) {
                            long j18 = aVar.e;
                            jVar.getClass();
                            StringBuilder sb3 = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb3.append(j18);
                            sb3.append(", ");
                            sb3.append(j12);
                            g41.a(jNanoTime2, ", ", ", ", sb3);
                            sb3.append(jC2);
                            sb3.append(", ");
                            tad tadVar3 = tad.this;
                            sb3.append(tadVar3.j());
                            sb3.append(", ");
                            sb3.append(tadVar3.k());
                            cft.g("DefaultAudioSink", sb3.toString());
                            i3 = 4;
                            f41Var2.a(4);
                            f2 = f;
                        } else if (Math.abs(jZ2 - jC2) > j8) {
                            long j19 = aVar.e;
                            jVar.getClass();
                            f2 = f;
                            StringBuilder sb4 = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb4.append(j19);
                            sb4.append(", ");
                            sb4.append(j12);
                            g41.a(jNanoTime2, ", ", ", ", sb4);
                            sb4.append(jC2);
                            sb4.append(", ");
                            tad tadVar4 = tad.this;
                            sb4.append(tadVar4.j());
                            sb4.append(", ");
                            sb4.append(tadVar4.k());
                            cft.g("DefaultAudioSink", sb4.toString());
                            i3 = 4;
                            f41Var2.a(4);
                        } else {
                            f2 = f;
                            i3 = 4;
                            if (f41Var2.d == 4) {
                                f41Var2.a(0);
                            }
                        }
                    } else {
                        audioTimestamp2 = audioTimestamp;
                        f2 = f;
                        i3 = 4;
                    }
                    i4 = f41Var2.d;
                    if (i4 != 0) {
                        audioTimestamp3 = audioTimestamp2;
                        z = false;
                        if (timestamp != 0) {
                            j9 = audioTimestamp3.nanoTime;
                            if (j9 / j >= f41Var2.e) {
                                f41Var2.h = aVar.e;
                                f41Var2.i = j9 / j;
                                f41Var2.a(1);
                            }
                        } else if (jNanoTime2 - f41Var2.e > 500000) {
                            f41Var2.a(3);
                        }
                    } else if (i4 != 1) {
                        if (i4 != 2) {
                            z = false;
                            if (timestamp == 0) {
                                f41Var2.a(0);
                            }
                        } else if (i4 != 3) {
                            if (i4 != i3) {
                                fm20.a();
                                return 0L;
                            }
                        } else if (timestamp) {
                            z = false;
                            f41Var2.a(0);
                        }
                    } else if (timestamp != 0) {
                        j10 = aVar.e;
                        j11 = f41Var2.h;
                        if (j10 <= j11) {
                            f3 = f2;
                            if (Math.abs((jrh0.z(f3, jNanoTime2 - (aVar.b.nanoTime / j)) + jrh0.T(i2, aVar.e)) - (jrh0.z(f3, jNanoTime2 - f41Var2.i) + jrh0.T(i2, j11))) < j) {
                                f41Var2.a(2);
                            } else if (jNanoTime2 - f41Var2.e > 2000000) {
                                f41Var2.a(3);
                            } else {
                                f41Var2.h = aVar.e;
                                f41Var2.i = audioTimestamp2.nanoTime / j;
                            }
                        } else if (jNanoTime2 - f41Var2.e > 2000000) {
                            f41Var2.a(3);
                        } else {
                            f41Var2.h = aVar.e;
                            f41Var2.i = audioTimestamp2.nanoTime / j;
                        }
                    } else {
                        z = false;
                        f41Var2.a(0);
                    }
                }
            }
            jNanoTime = this.F.nanoTime() / j;
            f41Var = this.e;
            f41Var.getClass();
            if (f41Var.d == 2) {
                z = true;
            }
            if (z) {
                float f4 = this.h;
                f41.a aVar2 = f41Var.a;
                jC = jrh0.z(f4, jNanoTime - (aVar2.b.nanoTime / j)) + jrh0.T(f41Var.b, aVar2.e);
            } else {
                jC = c(jNanoTime);
            }
            j3 = jC;
            playState = audioTrack.getPlayState();
            if (playState == 3) {
                if (z || ((i = f41Var.d) != 0 && i != 1)) {
                    e(j3);
                }
                j4 = this.C;
                if (j4 != -9223372036854775807L) {
                    j6 = j3 - this.B;
                    jZ = jrh0.z(this.h, jNanoTime - j4);
                    j7 = this.B + jZ;
                    long jAbs = Math.abs(j7 - j3);
                    if (j6 != j2 && jAbs < 1000000) {
                        long j20 = (jZ * 10) / 100;
                        j3 = jrh0.j(j3, j7 - j20, j7 + j20);
                    }
                }
                if (!this.A && !this.i) {
                    j5 = this.B;
                    if (j5 != -9223372036854775807L && j3 > j5) {
                        this.i = true;
                        this.a.a(this.F.a() - jrh0.Z(jrh0.B(this.h, jrh0.Z(j3 - j5))));
                    }
                }
                this.C = jNanoTime;
                this.B = j3;
            } else if (playState == 1) {
                e(j3);
            }
            return j3;
        }
        audioTrack = audioTrack2;
        j = 1000;
        j2 = 0;
        z = false;
        jNanoTime = this.F.nanoTime() / j;
        f41Var = this.e;
        f41Var.getClass();
        if (f41Var.d == 2) {
            z = true;
        }
        if (z) {
            float f5 = this.h;
            f41.a aVar3 = f41Var.a;
            jC = jrh0.z(f5, jNanoTime - (aVar3.b.nanoTime / j)) + jrh0.T(f41Var.b, aVar3.e);
        } else {
            jC = c(jNanoTime);
        }
        j3 = jC;
        playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z) {
                e(j3);
            } else {
                e(j3);
            }
            j4 = this.C;
            if (j4 != -9223372036854775807L) {
                j6 = j3 - this.B;
                jZ = jrh0.z(this.h, jNanoTime - j4);
                j7 = this.B + jZ;
                long jAbs2 = Math.abs(j7 - j3);
                if (j6 != j2) {
                    long j21 = (jZ * 10) / 100;
                    j3 = jrh0.j(j3, j7 - j21, j7 + j21);
                }
            }
            if (!this.A) {
                j5 = this.B;
                if (j5 != -9223372036854775807L) {
                    this.i = true;
                    this.a.a(this.F.a() - jrh0.Z(jrh0.B(this.h, jrh0.Z(j3 - j5))));
                }
            }
            this.C = jNanoTime;
            this.B = j3;
        } else if (playState == 1) {
            e(j3);
        }
        return j3;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    public final long b() {
        long j;
        if (this.w != -9223372036854775807L) {
            return Math.min(this.z, d());
        }
        long jD = this.F.d();
        if (jD - this.r >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.s;
                    if (j > playbackHeadPosition) {
                        if (this.D) {
                            this.E += j;
                            this.D = false;
                        } else {
                            this.t++;
                        }
                    }
                    this.s = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.s <= 0 || playState != 3) {
                    this.x = -9223372036854775807L;
                    j = this.s;
                    if (j > playbackHeadPosition) {
                        if (this.D) {
                            this.E += j;
                            this.D = false;
                        } else {
                            this.t++;
                        }
                    }
                    this.s = playbackHeadPosition;
                } else if (this.x == -9223372036854775807L) {
                    this.x = jD;
                }
            }
            this.r = jD;
        }
        return this.s + this.E + (this.t << 32);
    }

    public final long c(long j) {
        long jZ;
        if (this.v != 0) {
            jZ = jrh0.z(this.h, j + this.l);
        } else if (this.w != -9223372036854775807L) {
            jZ = jrh0.T(this.f, d());
        } else {
            jZ = jrh0.T(this.f, b());
        }
        long jMax = Math.max(0L, jZ - this.o);
        if (this.w == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(jrh0.T(this.f, this.z), jMax);
    }

    public final long d() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.y;
        }
        return this.y + jrh0.V(jrh0.z(this.h, jrh0.O(this.F.d()) - this.w), this.f, 1000000L, RoundingMode.UP);
    }

    public final void e(long j) {
        if (this.A) {
            long j2 = this.j;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jA = this.F.a() - jrh0.Z(jrh0.B(this.h, j - j2));
            this.j = -9223372036854775807L;
            this.a.a(jA);
        }
    }

    public final void f() {
        this.l = 0L;
        this.v = 0;
        this.u = 0;
        this.m = 0L;
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.i = false;
    }
}
