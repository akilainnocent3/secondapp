package o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f118587d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f118588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f118589b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f118590c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public g(String str) {
        this.f118588a = str;
    }

    public static f d(String str) throws h {
        return new g(str).c();
    }

    public final c a(c cVar, int i10, a aVar, boolean z10, char[] cArr) {
        c cVarF0;
        if (f118587d) {
            System.out.println("CREATE " + aVar + " at " + cArr[i10]);
        }
        switch (aVar.ordinal()) {
            case 1:
                cVarF0 = f.f0(cArr);
                i10++;
                break;
            case 2:
                cVarF0 = o0.a.B(cArr);
                i10++;
                break;
            case 3:
                cVarF0 = e.A(cArr);
                break;
            case 4:
                cVarF0 = i.A(cArr);
                break;
            case 5:
                cVarF0 = d.B(cArr);
                break;
            case 6:
                cVarF0 = j.A(cArr);
                break;
            default:
                cVarF0 = null;
                break;
        }
        if (cVarF0 == null) {
            return null;
        }
        cVarF0.w(this.f118590c);
        if (z10) {
            cVarF0.x(i10);
        }
        if (cVar instanceof b) {
            cVarF0.u((b) cVar);
        }
        return cVarF0;
    }

    public final c b(int i10, char c10, c cVar, char[] cArr) throws h {
        if (c10 != '\t' && c10 != '\n' && c10 != '\r' && c10 != ' ') {
            if (c10 == '\"' || c10 == '\'') {
                return cVar instanceof f ? a(cVar, i10, a.KEY, true, cArr) : a(cVar, i10, a.STRING, true, cArr);
            }
            if (c10 == '[') {
                return a(cVar, i10, a.ARRAY, true, cArr);
            }
            if (c10 != ']') {
                if (c10 == '{') {
                    return a(cVar, i10, a.OBJECT, true, cArr);
                }
                if (c10 != '}') {
                    switch (c10) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return a(cVar, i10, a.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            break;
                        case '/':
                            int i11 = i10 + 1;
                            if (i11 >= cArr.length || cArr[i11] != '/') {
                                return cVar;
                            }
                            this.f118589b = true;
                            return cVar;
                        default:
                            if (!(cVar instanceof b) || (cVar instanceof f)) {
                                return a(cVar, i10, a.KEY, true, cArr);
                            }
                            c cVarA = a(cVar, i10, a.TOKEN, true, cArr);
                            j jVar = (j) cVarA;
                            if (jVar.E(c10, i10)) {
                                return cVarA;
                            }
                            throw new h("incorrect token <" + c10 + "> at line " + this.f118590c, jVar);
                    }
                }
            }
            cVar.v(i10 - 1);
            c cVarG = cVar.g();
            cVarG.v(i10);
            return cVarG;
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0050 A[EDGE_INSN: B:108:0x0050->B:24:0x0050 BREAK  A[LOOP:1: B:14:0x0036->B:89:0x014e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x014e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0123  */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    public f c() throws h {
        boolean z10;
        long j10;
        char c10;
        long j11;
        j jVar;
        long j12;
        char[] charArray = this.f118588a.toCharArray();
        int length = charArray.length;
        int i10 = 1;
        this.f118590c = 1;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            char c11 = charArray[i11];
            if (c11 == '{') {
                break;
            }
            if (c11 == '\n') {
                this.f118590c++;
            }
            i11++;
        }
        if (i11 == -1) {
            throw new h("invalid json content", null);
        }
        f fVarF0 = f.f0(charArray);
        fVarF0.w(this.f118590c);
        fVarF0.x(i11);
        int i12 = i11 + 1;
        c cVarG = fVarF0;
        while (i12 < length) {
            char c12 = charArray[i12];
            if (c12 == '\n') {
                this.f118590c += i10;
            }
            if (this.f118589b) {
                if (c12 == '\n') {
                    this.f118589b = z11;
                    if (cVarG == null) {
                        break;
                        break;
                    }
                    if (cVarG.r()) {
                        cVarG = b(i12, c12, cVarG, charArray);
                    } else if (cVarG instanceof f) {
                        if (c12 == '}') {
                            cVarG.v(i12 - 1);
                        } else {
                            cVarG = b(i12, c12, cVarG, charArray);
                        }
                    } else if (cVarG instanceof o0.a) {
                        z10 = cVarG instanceof i;
                        if (z10) {
                            j12 = cVarG.f118579c;
                            if (charArray[(int) j12] == c12) {
                                cVarG.x(j12 + 1);
                                cVarG.v(i12 - 1);
                            }
                        } else {
                            if (cVarG instanceof j) {
                                jVar = (j) cVarG;
                                if (!jVar.E(c12, i12)) {
                                    throw new h("parsing incorrect token " + jVar.f() + " at line " + this.f118590c, jVar);
                                }
                            }
                            if (cVarG instanceof d) {
                                j10 = cVarG.f118579c;
                                c10 = charArray[(int) j10];
                                if (c10 != '\'') {
                                    cVarG.x(j10 + 1);
                                    cVarG.v(i12 - 1);
                                } else {
                                    cVarG.x(j10 + 1);
                                    cVarG.v(i12 - 1);
                                }
                            } else {
                                j10 = cVarG.f118579c;
                                c10 = charArray[(int) j10];
                                if (c10 != '\'') {
                                    cVarG.x(j10 + 1);
                                    cVarG.v(i12 - 1);
                                } else {
                                    cVarG.x(j10 + 1);
                                    cVarG.v(i12 - 1);
                                }
                            }
                            if (!cVarG.r()) {
                                j11 = i12 - 1;
                                cVarG.v(j11);
                                if (c12 != '}') {
                                    cVarG = cVarG.g();
                                    cVarG.v(j11);
                                    if (cVarG instanceof d) {
                                        cVarG = cVarG.g();
                                        cVarG.v(j11);
                                    }
                                } else {
                                    cVarG = cVarG.g();
                                    cVarG.v(j11);
                                    if (cVarG instanceof d) {
                                        cVarG = cVarG.g();
                                        cVarG.v(j11);
                                    }
                                }
                            }
                        }
                        if (!cVarG.r()) {
                        }
                    } else if (c12 == ']') {
                        cVarG.v(i12 - 1);
                    } else {
                        cVarG = b(i12, c12, cVarG, charArray);
                    }
                    i10 = i10;
                    if (!cVarG.r()) {
                    }
                } else {
                    i10 = i10;
                }
            } else {
                if (cVarG == null) {
                    break;
                }
                if (cVarG.r()) {
                    cVarG = b(i12, c12, cVarG, charArray);
                } else if (cVarG instanceof f) {
                    if (c12 == '}') {
                        cVarG.v(i12 - 1);
                    } else {
                        cVarG = b(i12, c12, cVarG, charArray);
                    }
                } else if (cVarG instanceof o0.a) {
                    z10 = cVarG instanceof i;
                    if (z10) {
                        j12 = cVarG.f118579c;
                        if (charArray[(int) j12] == c12) {
                            cVarG.x(j12 + 1);
                            cVarG.v(i12 - 1);
                        }
                    } else {
                        if (cVarG instanceof j) {
                            jVar = (j) cVarG;
                            if (!jVar.E(c12, i12)) {
                                throw new h("parsing incorrect token " + jVar.f() + " at line " + this.f118590c, jVar);
                            }
                        }
                        if ((cVarG instanceof d) || z10) {
                            j10 = cVarG.f118579c;
                            c10 = charArray[(int) j10];
                            if ((c10 != '\'' || c10 == '\"') && c10 == c12) {
                                cVarG.x(j10 + 1);
                                cVarG.v(i12 - 1);
                            }
                        }
                        if (!cVarG.r() && (c12 == '}' || c12 == ']' || c12 == ',' || c12 == ' ' || c12 == '\t' || c12 == '\r' || c12 == '\n' || c12 == ':')) {
                            j11 = i12 - 1;
                            cVarG.v(j11);
                            if (c12 != '}' || c12 == ']') {
                                cVarG = cVarG.g();
                                cVarG.v(j11);
                                if (cVarG instanceof d) {
                                    cVarG = cVarG.g();
                                    cVarG.v(j11);
                                }
                            }
                        }
                    }
                    if (!cVarG.r() && (!(cVarG instanceof d) || ((d) cVarG).f118575i.size() > 0)) {
                        cVarG = cVarG.g();
                    }
                } else if (c12 == ']') {
                    cVarG.v(i12 - 1);
                } else {
                    cVarG = b(i12, c12, cVarG, charArray);
                }
                i10 = i10;
                if (!cVarG.r()) {
                }
            }
            i12++;
            i10 = i10;
            z11 = false;
        }
        while (cVarG != null && !cVarG.r()) {
            if (cVarG instanceof i) {
                cVarG.x(((int) cVarG.f118579c) + 1);
            }
            cVarG.v(length - 1);
            cVarG = cVarG.g();
        }
        if (f118587d) {
            System.out.println("Root: " + fVarF0.z());
        }
        return fVarF0;
    }
}
