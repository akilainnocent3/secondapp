package defpackage;

import androidx.media3.common.a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class sbp implements k4h {
    public m4h b;
    public int c;
    public int d;
    public int e;
    public w5w g;
    public l4h h;
    public ewd0 i;
    public f8w j;
    public final nsz a = new nsz(2);
    public long f = -1;

    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        String strR;
        v5w v5wVarA;
        c150 c150Var;
        int i;
        w5w w5wVar;
        long j;
        int i2 = this.c;
        nsz nszVar = this.a;
        if (i2 == 0) {
            nszVar.F(2);
            l4hVar.readFully(nszVar.a, 0, 2);
            int iC = nszVar.C();
            this.d = iC;
            if (iC == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                d();
                return 0;
            }
            if ((iC < 65488 || iC > 65497) && iC != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            nszVar.F(2);
            l4hVar.readFully(nszVar.a, 0, 2);
            this.e = nszVar.C() - 2;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    fm20.a();
                    return 0;
                }
                if (this.i == null || l4hVar != this.h) {
                    this.h = l4hVar;
                    this.i = new ewd0(l4hVar, this.f);
                }
                f8w f8wVar = this.j;
                f8wVar.getClass();
                int iA = f8wVar.a(this.i, k620Var);
                if (iA == 1) {
                    k620Var.a += this.f;
                }
                return iA;
            }
            long position = l4hVar.getPosition();
            long j2 = this.f;
            if (position != j2) {
                k620Var.a = j2;
                return 1;
            }
            if (!l4hVar.c(nszVar.a, 0, 1, true)) {
                d();
                return 0;
            }
            l4hVar.e();
            if (this.j == null) {
                this.j = new f8w(ree0.a.a, 8);
            }
            ewd0 ewd0Var = new ewd0(l4hVar, this.f);
            this.i = ewd0Var;
            if (!this.j.b(ewd0Var)) {
                d();
                return 0;
            }
            f8w f8wVar2 = this.j;
            long j3 = this.f;
            m4h m4hVar = this.b;
            m4hVar.getClass();
            f8wVar2.l(new fwd0(j3, m4hVar));
            w5w w5wVar2 = this.g;
            w5wVar2.getClass();
            m4h m4hVar2 = this.b;
            m4hVar2.getClass();
            njg0 njg0VarR = m4hVar2.r(1024, 4);
            a.C0062a c0062a = new a.C0062a();
            c0062a.l = gqv.m("image/jpeg");
            c0062a.k = new uov(w5wVar2);
            p0j0.a(c0062a, njg0VarR);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            nsz nszVar2 = new nsz(this.e);
            l4hVar.readFully(nszVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(nszVar2.r()) && (strR = nszVar2.r()) != null) {
                long length = l4hVar.getLength();
                if (length == -1) {
                    w5wVar = null;
                } else {
                    try {
                        v5wVarA = p8k0.a(strR);
                    } catch (NumberFormatException | XmlPullParserException | ssz unused) {
                        cft.g("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        v5wVarA = null;
                    }
                    if (v5wVarA != null && (i = (c150Var = v5wVarA.b).d) >= 2) {
                        int i3 = i - 1;
                        long j4 = -1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        boolean z = false;
                        while (i3 >= 0) {
                            v5w.a aVar = (v5w.a) c150Var.get(i3);
                            boolean zEquals = "video/mp4".equals(aVar.a) | z;
                            if (i3 == 0) {
                                length -= aVar.c;
                                j = 0;
                            } else {
                                j = length - aVar.b;
                            }
                            long j8 = j;
                            long j9 = length;
                            length = j8;
                            if (zEquals && length != j9) {
                                j7 = j9 - length;
                                j6 = length;
                                zEquals = false;
                            }
                            if (i3 == 0) {
                                j4 = length;
                                j5 = j9;
                            }
                            i3--;
                            z = zEquals;
                        }
                        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                            w5wVar = null;
                        } else {
                            w5wVar = new w5w(j4, j5, v5wVarA.a, j6, j7);
                        }
                    } else {
                        w5wVar = null;
                    }
                }
                this.g = w5wVar;
                if (w5wVar != null) {
                    this.f = w5wVar.d;
                }
            }
        } else {
            l4hVar.l(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws EOFException, InterruptedIOException {
        jcd jcdVar = (jcd) l4hVar;
        nsz nszVar = this.a;
        nszVar.F(2);
        jcdVar.c(nszVar.a, 0, 2, false);
        if (nszVar.C() == 65496) {
            nszVar.F(2);
            jcdVar.c(nszVar.a, 0, 2, false);
            int iC = nszVar.C();
            this.d = iC;
            if (iC == 65504) {
                nszVar.F(2);
                jcdVar.c(nszVar.a, 0, 2, false);
                jcdVar.n(nszVar.C() - 2, false);
                nszVar.F(2);
                jcdVar.c(nszVar.a, 0, 2, false);
                iC = nszVar.C();
                this.d = iC;
            }
            if (iC == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            f8w f8wVar = this.j;
            f8wVar.getClass();
            f8wVar.c(j, j2);
        }
    }

    public final void d() {
        m4h m4hVar = this.b;
        m4hVar.getClass();
        m4hVar.n();
        this.b.k(new p480.b(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.b = m4hVar;
    }

    @Override // defpackage.k4h
    public final void release() {
        f8w f8wVar = this.j;
        if (f8wVar != null) {
            f8wVar.getClass();
        }
    }
}
