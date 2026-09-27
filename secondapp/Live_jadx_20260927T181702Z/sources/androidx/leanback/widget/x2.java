package androidx.leanback.widget;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends w2 {
    @Override // androidx.leanback.widget.w2
    public boolean K(int i10, boolean z10) {
        int i11;
        int i12;
        boolean z11;
        int iV;
        int i13;
        int i14;
        int count = this.f12590b.getCount();
        int i15 = this.f12595g;
        if (i15 < 0) {
            int i16 = this.f12597i;
            i11 = i16 != -1 ? i16 : 0;
            i12 = (this.f13131k.m() > 0 ? r(N()).f12598a + 1 : i11) % this.f12593e;
            z11 = false;
            iV = 0;
        } else {
            if (i15 < N()) {
                return false;
            }
            int i17 = this.f12595g;
            i11 = i17 + 1;
            i12 = r(i17).f12598a;
            int iT = T(true);
            if (iT < 0) {
                iV = Integer.MIN_VALUE;
                for (int i18 = 0; i18 < this.f12593e; i18++) {
                    iV = this.f12591c ? V(i18) : U(i18);
                    if (iV != Integer.MIN_VALUE) {
                        break;
                    }
                }
            } else {
                iV = this.f12591c ? l(false, iT, null) : j(true, iT, null);
            }
            if (!this.f12591c ? U(i12) >= iV : V(i12) <= iV) {
                i12++;
                if (i12 == this.f12593e) {
                    iV = this.f12591c ? m(false, null) : k(true, null);
                    i12 = 0;
                }
            }
            z11 = true;
        }
        boolean z12 = false;
        while (true) {
            if (i12 < this.f12593e) {
                if (i11 == count || (!z10 && d(i10))) {
                    break;
                }
                int iV2 = this.f12591c ? V(i12) : U(i12);
                if (iV2 != Integer.MAX_VALUE && iV2 != Integer.MIN_VALUE) {
                    if (this.f12591c) {
                        i14 = this.f12592d;
                        i13 = -i14;
                    } else {
                        i13 = this.f12592d;
                    }
                    iV2 += i13;
                } else if (i12 == 0) {
                    iV2 = this.f12591c ? V(this.f12593e - 1) : U(this.f12593e - 1);
                    if (iV2 != Integer.MAX_VALUE && iV2 != Integer.MIN_VALUE) {
                        if (this.f12591c) {
                            i14 = this.f12592d;
                            i13 = -i14;
                        } else {
                            i13 = this.f12592d;
                        }
                        iV2 += i13;
                    }
                } else {
                    iV2 = this.f12591c ? U(i12 - 1) : V(i12 - 1);
                }
                int i19 = i11 + 1;
                int iJ = J(i11, i12, iV2);
                if (z11) {
                    while (true) {
                        if (!this.f12591c) {
                            if (iV2 + iJ >= iV) {
                                break;
                            }
                            if (i19 != count) {
                            }
                            return true;
                        }
                        if (iV2 - iJ <= iV) {
                            break;
                        }
                        if (i19 != count || (!z10 && d(i10))) {
                            return true;
                        }
                        iV2 += this.f12591c ? (-iJ) - this.f12592d : iJ + this.f12592d;
                        int i20 = i19 + 1;
                        int iJ2 = J(i19, i12, iV2);
                        i19 = i20;
                        iJ = iJ2;
                    }
                } else {
                    z11 = true;
                    iV = this.f12591c ? V(i12) : U(i12);
                }
                i11 = i19;
                i12++;
                z12 = true;
            } else {
                if (z10) {
                    break;
                }
                iV = this.f12591c ? m(false, null) : k(true, null);
                i12 = 0;
            }
        }
        return z12;
    }

    @Override // androidx.leanback.widget.w2
    public boolean S(int i10, boolean z10) {
        int i11;
        int i12;
        boolean z11;
        int iU;
        int i13;
        int i14;
        int i15 = this.f12594f;
        if (i15 < 0) {
            int i16 = this.f12597i;
            i11 = i16 != -1 ? i16 : 0;
            i12 = (this.f13131k.m() > 0 ? (r(M()).f12598a + this.f12593e) - 1 : i11) % this.f12593e;
            z11 = false;
            iU = 0;
        } else {
            if (i15 > M()) {
                return false;
            }
            int i17 = this.f12594f;
            i11 = i17 - 1;
            i12 = r(i17).f12598a;
            int iT = T(false);
            if (iT < 0) {
                i12--;
                iU = Integer.MAX_VALUE;
                for (int i18 = this.f12593e - 1; i18 >= 0; i18--) {
                    iU = this.f12591c ? U(i18) : V(i18);
                    if (iU != Integer.MAX_VALUE) {
                        break;
                    }
                }
            } else {
                iU = this.f12591c ? j(true, iT, null) : l(false, iT, null);
            }
            if (!this.f12591c ? V(i12) <= iU : U(i12) >= iU) {
                i12--;
                if (i12 < 0) {
                    i12 = this.f12593e - 1;
                    iU = this.f12591c ? k(true, null) : m(false, null);
                }
            }
            z11 = true;
        }
        boolean z12 = false;
        while (true) {
            if (i12 >= 0) {
                if (i11 < 0 || (!z10 && e(i10))) {
                    break;
                }
                int iU2 = this.f12591c ? U(i12) : V(i12);
                if (iU2 != Integer.MAX_VALUE && iU2 != Integer.MIN_VALUE) {
                    if (this.f12591c) {
                        i14 = this.f12592d;
                    } else {
                        i13 = this.f12592d;
                        i14 = -i13;
                    }
                    iU2 += i14;
                } else if (i12 == this.f12593e - 1) {
                    iU2 = this.f12591c ? U(0) : V(0);
                    if (iU2 != Integer.MAX_VALUE && iU2 != Integer.MIN_VALUE) {
                        if (this.f12591c) {
                            i14 = this.f12592d;
                        } else {
                            i13 = this.f12592d;
                            i14 = -i13;
                        }
                        iU2 += i14;
                    }
                } else {
                    iU2 = this.f12591c ? V(i12 + 1) : U(i12 + 1);
                }
                int i19 = i11 - 1;
                int iR = R(i11, i12, iU2);
                if (z11) {
                    while (true) {
                        if (!this.f12591c) {
                            if (iU2 - iR <= iU) {
                                break;
                            }
                            if (i19 >= 0) {
                            }
                            return true;
                        }
                        if (iU2 + iR >= iU) {
                            break;
                        }
                        if (i19 >= 0 || (!z10 && e(i10))) {
                            return true;
                        }
                        iU2 += this.f12591c ? iR + this.f12592d : (-iR) - this.f12592d;
                        int i20 = i19 - 1;
                        int iR2 = R(i19, i12, iU2);
                        i19 = i20;
                        iR = iR2;
                    }
                } else {
                    z11 = true;
                    iU = this.f12591c ? U(i12) : V(i12);
                }
                i11 = i19;
                i12--;
                z12 = true;
            } else {
                if (z10) {
                    break;
                }
                iU = this.f12591c ? k(true, null) : m(false, null);
                i12 = this.f12593e - 1;
            }
        }
        return z12;
    }

    public final int T(boolean z10) {
        boolean z11 = false;
        if (z10) {
            for (int i10 = this.f12595g; i10 >= this.f12594f; i10--) {
                int i11 = r(i10).f12598a;
                if (i11 == 0) {
                    z11 = true;
                } else if (z11 && i11 == this.f12593e - 1) {
                    return i10;
                }
            }
            return -1;
        }
        for (int i12 = this.f12594f; i12 <= this.f12595g; i12++) {
            int i13 = r(i12).f12598a;
            if (i13 == this.f12593e - 1) {
                z11 = true;
            } else if (z11 && i13 == 0) {
                return i12;
            }
        }
        return -1;
    }

    public int U(int i10) {
        int i11;
        w2.a aVarR;
        int i12 = this.f12594f;
        if (i12 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.f12591c) {
            int iA = this.f12590b.a(i12);
            if (r(this.f12594f).f12598a == i10) {
                return iA;
            }
            int i13 = this.f12594f;
            do {
                i13++;
                if (i13 <= N()) {
                    aVarR = r(i13);
                    iA += aVarR.f13135b;
                }
            } while (aVarR.f12598a != i10);
            return iA;
        }
        int iA2 = this.f12590b.a(this.f12595g);
        w2.a aVarR2 = r(this.f12595g);
        if (aVarR2.f12598a == i10) {
            i11 = aVarR2.f13136c;
        } else {
            int i14 = this.f12595g;
            do {
                i14--;
                if (i14 >= M()) {
                    iA2 -= aVarR2.f13135b;
                    aVarR2 = r(i14);
                }
            } while (aVarR2.f12598a != i10);
            i11 = aVarR2.f13136c;
        }
        return iA2 + i11;
        return Integer.MIN_VALUE;
    }

    public int V(int i10) {
        w2.a aVarR;
        int i11;
        int i12 = this.f12594f;
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        if (!this.f12591c) {
            int iA = this.f12590b.a(i12);
            if (r(this.f12594f).f12598a == i10) {
                return iA;
            }
            int i13 = this.f12594f;
            do {
                i13++;
                if (i13 <= N()) {
                    aVarR = r(i13);
                    iA += aVarR.f13135b;
                }
            } while (aVarR.f12598a != i10);
            return iA;
        }
        int iA2 = this.f12590b.a(this.f12595g);
        w2.a aVarR2 = r(this.f12595g);
        if (aVarR2.f12598a == i10) {
            i11 = aVarR2.f13136c;
        } else {
            int i14 = this.f12595g;
            do {
                i14--;
                if (i14 >= M()) {
                    iA2 -= aVarR2.f13135b;
                    aVarR2 = r(i14);
                }
            } while (aVarR2.f12598a != i10);
            i11 = aVarR2.f13136c;
        }
        return iA2 - i11;
        return Integer.MAX_VALUE;
    }

    @Override // androidx.leanback.widget.h0
    public int j(boolean z10, int i10, int[] iArr) {
        int i11;
        int iA = this.f12590b.a(i10);
        w2.a aVarR = r(i10);
        int i12 = aVarR.f12598a;
        if (this.f12591c) {
            i11 = i12;
            int i13 = i11;
            int i14 = 1;
            int i15 = iA;
            for (int i16 = i10 + 1; i14 < this.f12593e && i16 <= this.f12595g; i16++) {
                w2.a aVarR2 = r(i16);
                i15 += aVarR2.f13135b;
                int i17 = aVarR2.f12598a;
                if (i17 != i13) {
                    i14++;
                    if (!z10 ? i15 >= iA : i15 <= iA) {
                        i13 = i17;
                    } else {
                        iA = i15;
                        i10 = i16;
                        i11 = i17;
                        i13 = i11;
                    }
                }
            }
        } else {
            int i18 = 1;
            int i19 = i12;
            w2.a aVarR3 = aVarR;
            int i20 = iA;
            iA = this.f12590b.b(i10) + iA;
            i11 = i19;
            for (int i21 = i10 - 1; i18 < this.f12593e && i21 >= this.f12594f; i21--) {
                i20 -= aVarR3.f13135b;
                aVarR3 = r(i21);
                int i22 = aVarR3.f12598a;
                if (i22 != i19) {
                    i18++;
                    int iB = this.f12590b.b(i21) + i20;
                    if (!z10 ? iB >= iA : iB <= iA) {
                        i19 = i22;
                    } else {
                        iA = iB;
                        i10 = i21;
                        i11 = i22;
                        i19 = i11;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i11;
            iArr[1] = i10;
        }
        return iA;
    }

    @Override // androidx.leanback.widget.h0
    public int l(boolean z10, int i10, int[] iArr) {
        int iB;
        int iA = this.f12590b.a(i10);
        w2.a aVarR = r(i10);
        int i11 = aVarR.f12598a;
        if (this.f12591c) {
            int i12 = 1;
            iB = iA - this.f12590b.b(i10);
            int i13 = i11;
            for (int i14 = i10 - 1; i12 < this.f12593e && i14 >= this.f12594f; i14--) {
                iA -= aVarR.f13135b;
                aVarR = r(i14);
                int i15 = aVarR.f12598a;
                if (i15 != i13) {
                    i12++;
                    int iB2 = iA - this.f12590b.b(i14);
                    if (!z10 ? iB2 >= iB : iB2 <= iB) {
                        i13 = i15;
                    } else {
                        iB = iB2;
                        i10 = i14;
                        i11 = i15;
                        i13 = i11;
                    }
                }
            }
        } else {
            int i16 = i11;
            int i17 = i16;
            int i18 = 1;
            int i19 = iA;
            for (int i20 = i10 + 1; i18 < this.f12593e && i20 <= this.f12595g; i20++) {
                w2.a aVarR2 = r(i20);
                i19 += aVarR2.f13135b;
                int i21 = aVarR2.f12598a;
                if (i21 != i17) {
                    i18++;
                    if (!z10 ? i19 >= iA : i19 <= iA) {
                        i17 = i21;
                    } else {
                        iA = i19;
                        i10 = i20;
                        i16 = i21;
                        i17 = i16;
                    }
                }
            }
            iB = iA;
            i11 = i16;
        }
        if (iArr != null) {
            iArr[0] = i11;
            iArr[1] = i10;
        }
        return iB;
    }
}
