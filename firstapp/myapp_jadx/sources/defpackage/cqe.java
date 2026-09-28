package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class cqe {
    public static final String h = new String("FIXED_DIMENSION");
    public static final String i = new String("WRAP_DIMENSION");
    public static final String j = new String("SPREAD_DIMENSION");
    public static final String k = new String("PARENT_DIMENSION");
    public static final String l = new String("PERCENT_DIMENSION");
    public static final String m = new String("RATIO_DIMENSION");
    public String f;
    public int a = 0;
    public int b = Reader.READ_DONE;
    public float c = 1.0f;
    public int d = 0;
    public String e = null;
    public boolean g = false;

    public cqe(String str) {
        this.f = str;
    }

    public static cqe b(int i2) {
        cqe cqeVar = new cqe(h);
        cqeVar.f = null;
        cqeVar.d = i2;
        return cqeVar;
    }

    public static cqe c(String str) {
        cqe cqeVar = new cqe();
        cqeVar.a = 0;
        cqeVar.b = Reader.READ_DONE;
        cqeVar.c = 1.0f;
        cqeVar.d = 0;
        cqeVar.e = null;
        cqeVar.f = str;
        cqeVar.g = true;
        return cqeVar;
    }

    public final void a(ixa ixaVar, int i2) {
        String str = this.e;
        if (str != null) {
            ixaVar.L(str);
        }
        boolean z = this.g;
        ixa.a aVar = ixa.a.a;
        ixa.a aVar2 = ixa.a.d;
        String str2 = k;
        ixa.a aVar3 = ixa.a.b;
        int i3 = 2;
        String str3 = l;
        ixa.a aVar4 = ixa.a.c;
        String str4 = i;
        if (i2 == 0) {
            if (z) {
                ixaVar.P(aVar4);
                String str5 = this.f;
                if (str5 == str4) {
                    i3 = 1;
                } else if (str5 != str3) {
                    i3 = 0;
                }
                ixaVar.Q(this.c, i3, this.a, this.b);
                return;
            }
            int i4 = this.a;
            if (i4 > 0) {
                if (i4 < 0) {
                    ixaVar.e0 = 0;
                } else {
                    ixaVar.e0 = i4;
                }
            }
            int i5 = this.b;
            if (i5 < Integer.MAX_VALUE) {
                ixaVar.D[0] = i5;
            }
            String str6 = this.f;
            if (str6 == str4) {
                ixaVar.P(aVar3);
                return;
            }
            if (str6 == str2) {
                ixaVar.P(aVar2);
                return;
            } else {
                if (str6 == null) {
                    ixaVar.P(aVar);
                    ixaVar.T(this.d);
                    return;
                }
                return;
            }
        }
        if (z) {
            ixaVar.R(aVar4);
            String str7 = this.f;
            if (str7 == str4) {
                i3 = 1;
            } else if (str7 != str3) {
                i3 = 0;
            }
            ixaVar.S(this.c, i3, this.a, this.b);
            return;
        }
        int i6 = this.a;
        if (i6 > 0) {
            if (i6 < 0) {
                ixaVar.f0 = 0;
            } else {
                ixaVar.f0 = i6;
            }
        }
        int i7 = this.b;
        if (i7 < Integer.MAX_VALUE) {
            ixaVar.D[1] = i7;
        }
        String str8 = this.f;
        if (str8 == str4) {
            ixaVar.R(aVar3);
            return;
        }
        if (str8 == str2) {
            ixaVar.R(aVar2);
        } else if (str8 == null) {
            ixaVar.R(aVar);
            ixaVar.O(this.d);
        }
    }
}
