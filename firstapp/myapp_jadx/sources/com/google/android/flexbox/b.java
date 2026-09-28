package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import defpackage.avh;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.rr1;
import defpackage.uts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final avh a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;

    public static class a {
        public List<com.google.android.flexbox.a> a;
        public int b;
    }

    /* JADX INFO: renamed from: com.google.android.flexbox.b$b, reason: collision with other inner class name */
    public static class C0189b implements Comparable<C0189b> {
        public int a;
        public int b;

        @Override // java.lang.Comparable
        public final int compareTo(C0189b c0189b) {
            C0189b c0189b2 = c0189b;
            int i = this.b;
            int i2 = c0189b2.b;
            return i != i2 ? i - i2 : this.a - c0189b2.a;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.b);
            sb.append(", index=");
            return rr1.b(sb, this.a, '}');
        }
    }

    public b(avh avhVar) {
        this.a = avhVar;
    }

    public static ArrayList e(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        com.google.android.flexbox.a aVar = new com.google.android.flexbox.a();
        aVar.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(aVar);
            }
            arrayList.add((com.google.android.flexbox.a) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C0189b c0189b = (C0189b) obj;
            int i4 = c0189b.a;
            iArr[i2] = i4;
            sparseIntArray.append(i4, c0189b.b);
            i2++;
        }
        return iArr;
    }

    public final void a(List<com.google.android.flexbox.a> list, com.google.android.flexbox.a aVar, int i, int i2) {
        aVar.m = i2;
        this.a.j(aVar);
        aVar.p = i;
        list.add(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    public final void b(a aVar, int i, int i2, int i3, int i4, int i5, List<com.google.android.flexbox.a> list) {
        int iG;
        FlexItem flexItem;
        int i6;
        boolean z;
        int i7 = i;
        avh avhVar = this.a;
        boolean zO = avhVar.o();
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        List<com.google.android.flexbox.a> arrayList = list == null ? new ArrayList<>() : list;
        aVar.a = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = zO ? avhVar.getPaddingStart() : avhVar.getPaddingTop();
        int paddingEnd = zO ? avhVar.getPaddingEnd() : avhVar.getPaddingBottom();
        int paddingTop = zO ? avhVar.getPaddingTop() : avhVar.getPaddingStart();
        int paddingBottom = zO ? avhVar.getPaddingBottom() : avhVar.getPaddingEnd();
        com.google.android.flexbox.a aVar2 = new com.google.android.flexbox.a();
        int i8 = i4;
        int i9 = 1;
        aVar2.o = i8;
        int i10 = paddingStart + paddingEnd;
        aVar2.e = i10;
        int flexItemCount = avhVar.getFlexItemCount();
        boolean z3 = z2;
        int i11 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i12 = 0;
        int i13 = 0;
        while (i8 < flexItemCount) {
            int i14 = flexItemCount;
            View viewK = avhVar.k(i8);
            if (viewK != null) {
                if (viewK.getVisibility() == 8) {
                    aVar2.i++;
                    aVar2.h++;
                    if (i8 == i14 - 1 && aVar2.a() != 0) {
                        a(arrayList, aVar2, i8, i12);
                    }
                } else {
                    if (viewK instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewK;
                        FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                        int iJ = flexItem2.J();
                        int iX1 = flexItem2.x1();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        if (iJ == -1) {
                            iJ = minimumWidth;
                        }
                        flexItem2.W0(iJ);
                        if (iX1 == -1) {
                            iX1 = minimumHeight;
                        }
                        flexItem2.Y(iX1);
                    }
                    FlexItem flexItem3 = (FlexItem) viewK.getLayoutParams();
                    if (flexItem3.F() == 4) {
                        aVar2.n.add(Integer.valueOf(i8));
                    }
                    int iC = zO ? flexItem3.c() : flexItem3.b();
                    if (flexItem3.h0() != -1.0f && mode == 1073741824) {
                        iC = Math.round(size * flexItem3.h0());
                    }
                    if (zO) {
                        iG = avhVar.e(i7, i10 + flexItem3.a1() + flexItem3.v1(), iC);
                        int iG2 = avhVar.g(i2, paddingTop + paddingBottom + flexItem3.V() + flexItem3.X0() + i12, flexItem3.b());
                        viewK.measure(iG, iG2);
                        v(i8, iG, iG2, viewK);
                    } else {
                        int iE = avhVar.e(i2, paddingTop + paddingBottom + flexItem3.a1() + flexItem3.v1() + i12, flexItem3.c());
                        iG = avhVar.g(i7, i10 + flexItem3.V() + flexItem3.X0(), iC);
                        viewK.measure(iE, iG);
                        v(i8, iE, iG, viewK);
                    }
                    avhVar.l(i8, viewK);
                    c(i8, viewK);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewK.getMeasuredState());
                    int i15 = aVar2.e;
                    int measuredWidth = (zO ? viewK.getMeasuredWidth() : viewK.getMeasuredHeight()) + (zO ? flexItem3.a1() : flexItem3.V()) + (zO ? flexItem3.v1() : flexItem3.X0());
                    int size2 = arrayList.size();
                    if (avhVar.getFlexWrap() != 0) {
                        if (flexItem3.n0()) {
                            flexItem = flexItem3;
                        } else {
                            if (mode == 0) {
                                flexItem = flexItem3;
                            } else {
                                flexItem = flexItem3;
                                int maxLine = avhVar.getMaxLine();
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    int iM = avhVar.m(viewK, i8, i13);
                                    if (iM > 0) {
                                        measuredWidth += iM;
                                    }
                                    if (size < i15 + measuredWidth) {
                                    }
                                }
                            }
                            i10 = i10;
                            arrayList = arrayList;
                            aVar2.h += i9;
                            i13++;
                            i6 = i11;
                        }
                        if (aVar2.a() > 0) {
                            arrayList = arrayList;
                            a(arrayList, aVar2, i8 > 0 ? i8 - 1 : 0, i12);
                            i12 += aVar2.g;
                        }
                        if (zO) {
                            arrayList = arrayList;
                            if (flexItem.b() == -1) {
                                viewK.measure(iG, avhVar.g(i2, avhVar.getPaddingBottom() + avhVar.getPaddingTop() + flexItem.V() + flexItem.X0() + i12, flexItem.b()));
                                c(i8, viewK);
                            }
                        } else {
                            arrayList = arrayList;
                            if (flexItem.c() == -1) {
                                viewK.measure(avhVar.e(i2, avhVar.getPaddingRight() + avhVar.getPaddingLeft() + flexItem.a1() + flexItem.v1() + i12, flexItem.c()), iG);
                                c(i8, viewK);
                            }
                        }
                        aVar2 = new com.google.android.flexbox.a();
                        aVar2.h = i9;
                        i10 = i10;
                        aVar2.e = i10;
                        aVar2.o = i8;
                        i6 = Integer.MIN_VALUE;
                        i13 = 0;
                    } else {
                        flexItem = flexItem3;
                        i10 = i10;
                        arrayList = arrayList;
                        aVar2.h += i9;
                        i13++;
                        i6 = i11;
                    }
                    aVar2.q |= flexItem.b0() != 0.0f;
                    aVar2.r |= flexItem.H() != 0.0f;
                    int[] iArr = this.c;
                    if (iArr != null) {
                        iArr[i8] = arrayList.size();
                    }
                    aVar2.e = (zO ? viewK.getMeasuredWidth() : viewK.getMeasuredHeight()) + (zO ? flexItem.a1() : flexItem.V()) + (zO ? flexItem.v1() : flexItem.X0()) + aVar2.e;
                    aVar2.j += flexItem.b0();
                    aVar2.k += flexItem.H();
                    avhVar.c(viewK, i8, i13, aVar2);
                    int iMax = Math.max(i6, avhVar.i(viewK) + (zO ? viewK.getMeasuredHeight() : viewK.getMeasuredWidth()) + (zO ? flexItem.V() : flexItem.a1()) + (zO ? flexItem.X0() : flexItem.v1()));
                    aVar2.g = Math.max(aVar2.g, iMax);
                    if (zO) {
                        int flexWrap = avhVar.getFlexWrap();
                        int i16 = aVar2.l;
                        i11 = iMax;
                        if (flexWrap != 2) {
                            aVar2.l = Math.max(i16, viewK.getBaseline() + flexItem.V());
                        } else {
                            aVar2.l = Math.max(i16, (viewK.getMeasuredHeight() - viewK.getBaseline()) + flexItem.X0());
                        }
                    } else {
                        i11 = iMax;
                    }
                    if (i8 == i14 - 1 && aVar2.a() != 0) {
                        a(arrayList, aVar2, i8, i12);
                        i12 += aVar2.g;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        if (((com.google.android.flexbox.a) uts.a(1, arrayList)).p >= i5 && i8 >= i5 && !z3) {
                            i12 = -aVar2.g;
                            z = true;
                        }
                        if (i12 > i3 && z) {
                            break;
                        }
                    }
                    z = z3;
                    if (i12 > i3) {
                        continue;
                    }
                }
                i8++;
                i7 = i;
                z3 = z;
                flexItemCount = i14;
                i9 = 1;
            } else if (i8 == i14 - 1 && aVar2.a() != 0) {
                a(arrayList, aVar2, i8, i12);
            }
            z = z3;
            i8++;
            i7 = i;
            z3 = z;
            flexItemCount = i14;
            i9 = 1;
        }
        aVar.b = iCombineMeasuredStates;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void c(int i, View view) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= flexItem.J()) {
            if (measuredWidth > flexItem.u0()) {
                measuredWidth = flexItem.u0();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.x1()) {
                measuredHeight = flexItem.x1();
            } else if (measuredHeight > flexItem.A1()) {
                measuredHeight = flexItem.A1();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                v(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.a.l(i, view);
            }
        }
        measuredWidth = flexItem.J();
        z = true;
        if (measuredHeight < flexItem.x1()) {
            measuredHeight = flexItem.x1();
        } else if (measuredHeight > flexItem.A1()) {
            measuredHeight = flexItem.A1();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            v(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.a.l(i, view);
        }
    }

    public final void d(int i, List list) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final ArrayList f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.a.f(i2).getLayoutParams();
            C0189b c0189b = new C0189b();
            c0189b.b = flexItem.getOrder();
            c0189b.a = i2;
            arrayList.add(c0189b);
        }
        return arrayList;
    }

    public final void g(int i, int i2, int i3) {
        int mode;
        int size;
        int iRound;
        avh avhVar = this.a;
        int flexDirection = avhVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            hb5.a(hce0.a(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<com.google.android.flexbox.a> flexLinesInternal = avhVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = avhVar.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = avhVar.getAlignContent();
                if (alignContent == 1) {
                    com.google.android.flexbox.a aVar = new com.google.android.flexbox.a();
                    aVar.g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, aVar);
                    return;
                }
                if (alignContent == 2) {
                    avhVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add(flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            com.google.android.flexbox.a aVar2 = new com.google.android.flexbox.a();
                            if (i4 == flexLinesInternal.size() - 2) {
                                int iRound2 = Math.round(f + size3);
                                aVar2.g = iRound2;
                                iRound = iRound2;
                                f = 0.0f;
                            } else {
                                iRound = Math.round(size3);
                                aVar2.g = iRound;
                            }
                            float f2 = (size3 - iRound) + f;
                            if (f2 > 1.0f) {
                                aVar2.g = iRound + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                aVar2.g = iRound - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(aVar2);
                        }
                        i4++;
                    }
                    avhVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        avhVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.google.android.flexbox.a aVar3 = new com.google.android.flexbox.a();
                    aVar3.g = size5;
                    for (com.google.android.flexbox.a aVar4 : flexLinesInternal) {
                        arrayList2.add(aVar3);
                        arrayList2.add(aVar4);
                        arrayList2.add(aVar3);
                    }
                    avhVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        com.google.android.flexbox.a aVar5 = flexLinesInternal.get(i4);
                        float f4 = aVar5.g + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound3 = Math.round(f4);
                        float f5 = (f4 - iRound3) + f3;
                        if (f5 > 1.0f) {
                            iRound3++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound3--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        aVar5.g = iRound3;
                        i4++;
                    }
                }
            }
        }
    }

    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        b bVar;
        int i4;
        int i5;
        avh avhVar = this.a;
        int flexItemCount = avhVar.getFlexItemCount();
        boolean[] zArr = this.b;
        if (zArr == null) {
            this.b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= avhVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = avhVar.getFlexDirection();
        int flexDirection2 = avhVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = avhVar.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = avhVar.getPaddingLeft();
            paddingRight = avhVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                hb5.a(hce0.a(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = avhVar.getLargestMainSize();
            }
            paddingLeft = avhVar.getPaddingTop();
            paddingRight = avhVar.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = this.c;
        int i8 = iArr != null ? iArr[i3] : 0;
        List<com.google.android.flexbox.a> flexLinesInternal = avhVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            com.google.android.flexbox.a aVar = flexLinesInternal.get(i8);
            int i9 = aVar.e;
            if (i9 >= i7 || !aVar.q) {
                bVar = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && aVar.r) {
                    bVar.q(i4, i5, aVar, i7, i6, false);
                }
            } else {
                bVar = this;
                i4 = i;
                i5 = i2;
                bVar.l(i4, i5, aVar, i7, i6, false);
            }
            i8++;
            this = bVar;
            i = i4;
            i2 = i5;
        }
    }

    public final void i(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf(this.c, Math.max(iArr.length * 2, i));
        }
    }

    public final void j(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf(this.d, Math.max(jArr.length * 2, i));
        }
    }

    public final void k(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(jArr.length * 2, i));
        }
    }

    public final void l(int i, int i2, com.google.android.flexbox.a aVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        boolean z2;
        int i6;
        int iMax;
        double d;
        boolean z3;
        double d2;
        float f3 = aVar.j;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 < (i5 = aVar.e)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        float f6 = 0.0f;
        while (i7 < aVar.h) {
            int i9 = aVar.o + i7;
            avh avhVar = this.a;
            View viewK = avhVar.k(i9);
            if (viewK == null || viewK.getVisibility() == 8) {
                f = f4;
                i5 = i5;
                f2 = f5;
                z2 = z4;
                i6 = i7;
            } else {
                FlexItem flexItem = (FlexItem) viewK.getLayoutParams();
                int flexDirection = avhVar.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i5;
                    float f7 = f5;
                    z2 = z4;
                    int measuredWidth = viewK.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = viewK.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i9] >> 32);
                    }
                    if (this.b[i9] || flexItem.b0() <= f) {
                        i6 = i7;
                        f2 = f7;
                    } else {
                        float fB0 = (f7 * flexItem.b0()) + measuredWidth;
                        if (i7 == aVar.h - 1) {
                            fB0 += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fB0);
                        if (iRound > flexItem.u0()) {
                            iRound = flexItem.u0();
                            this.b[i9] = true;
                            aVar.j -= flexItem.b0();
                            z2 = true;
                            i6 = i7;
                            f2 = f7;
                        } else {
                            float f8 = (fB0 - iRound) + f6;
                            i6 = i7;
                            f2 = f7;
                            double d3 = f8;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            } else {
                                f6 = f8;
                            }
                            f6 = (float) d;
                        }
                        int iM = m(i2, flexItem, aVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewK.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewK.getMeasuredWidth();
                        int measuredHeight2 = viewK.getMeasuredHeight();
                        v(i9, iMakeMeasureSpec, iM, viewK);
                        avhVar.l(i9, viewK);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i8, avhVar.i(viewK) + measuredHeight + flexItem.V() + flexItem.X0());
                    aVar.e = measuredWidth + flexItem.a1() + flexItem.v1() + aVar.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewK.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i9] >> 32);
                    }
                    int measuredWidth3 = viewK.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i9];
                    }
                    if (this.b[i9] || flexItem.b0() <= f) {
                        i5 = i5;
                        z3 = z4;
                    } else {
                        float fB1 = (flexItem.b0() * f5) + measuredHeight3;
                        if (i7 == aVar.h - 1) {
                            fB1 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fB1);
                        if (iRound2 > flexItem.A1()) {
                            iRound2 = flexItem.A1();
                            this.b[i9] = true;
                            aVar.j -= flexItem.b0();
                            z3 = true;
                        } else {
                            float f9 = (fB1 - iRound2) + f6;
                            double d4 = f9;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                } else {
                                    f6 = f9;
                                }
                                z3 = z4;
                            }
                            f6 = (float) d2;
                            z3 = z4;
                        }
                        int iN = n(i, flexItem, aVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewK.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewK.getMeasuredWidth();
                        int measuredHeight4 = viewK.getMeasuredHeight();
                        v(i9, iN, iMakeMeasureSpec2, viewK);
                        avhVar.l(i9, viewK);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i8, avhVar.i(viewK) + measuredWidth3 + flexItem.a1() + flexItem.v1());
                    aVar.e = measuredHeight3 + flexItem.V() + flexItem.X0() + aVar.e;
                    f2 = f5;
                    z2 = z3;
                    i6 = i7;
                }
                aVar.g = Math.max(aVar.g, iMax);
                i8 = iMax;
            }
            i7 = i6 + 1;
            f5 = f2;
            f4 = f;
            i5 = i5;
            z4 = z2;
        }
        int i10 = i5;
        if (!z4 || i10 == aVar.e) {
            return;
        }
        l(i, i2, aVar, i3, i4, true);
    }

    public final int m(int i, FlexItem flexItem, int i2) {
        avh avhVar = this.a;
        int iG = avhVar.g(i, avhVar.getPaddingBottom() + avhVar.getPaddingTop() + flexItem.V() + flexItem.X0() + i2, flexItem.b());
        int size = View.MeasureSpec.getSize(iG);
        if (size > flexItem.A1()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.A1(), View.MeasureSpec.getMode(iG));
        }
        return size < flexItem.x1() ? View.MeasureSpec.makeMeasureSpec(flexItem.x1(), View.MeasureSpec.getMode(iG)) : iG;
    }

    public final int n(int i, FlexItem flexItem, int i2) {
        avh avhVar = this.a;
        int iE = avhVar.e(i, avhVar.getPaddingRight() + avhVar.getPaddingLeft() + flexItem.a1() + flexItem.v1() + i2, flexItem.c());
        int size = View.MeasureSpec.getSize(iE);
        if (size > flexItem.u0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.u0(), View.MeasureSpec.getMode(iE));
        }
        return size < flexItem.J() ? View.MeasureSpec.makeMeasureSpec(flexItem.J(), View.MeasureSpec.getMode(iE)) : iE;
    }

    public final void o(View view, com.google.android.flexbox.a aVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        avh avhVar = this.a;
        int alignItems = avhVar.getAlignItems();
        if (flexItem.F() != -1) {
            alignItems = flexItem.F();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (avhVar.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.X0(), i3, i6 - flexItem.X0());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.V(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.V());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.V()) - flexItem.X0()) / 2;
                if (avhVar.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = avhVar.getFlexWrap();
                int i9 = aVar.l;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), flexItem.V());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), flexItem.X0());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (avhVar.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.V(), i3, i4 + flexItem.V());
        } else {
            view.layout(i, i2 - flexItem.X0(), i3, i4 - flexItem.X0());
        }
    }

    public final void p(View view, com.google.android.flexbox.a aVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (flexItem.F() != -1) {
            alignItems = flexItem.F();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.v1(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.v1(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.a1(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.a1(), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.v1(), i2, i3 - flexItem.v1(), i4);
        } else {
            view.layout(i + flexItem.a1(), i2, i3 + flexItem.a1(), i4);
        }
    }

    public final void q(int i, int i2, com.google.android.flexbox.a aVar, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int iJ;
        int iX1;
        int i5 = aVar.e;
        float f2 = aVar.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i5) {
            return;
        }
        float f4 = (i5 - i3) / f2;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < aVar.h) {
            int i8 = aVar.o + i6;
            avh avhVar = this.a;
            View viewK = avhVar.k(i8);
            if (viewK == null || viewK.getVisibility() == 8) {
                f = f3;
                f4 = f4;
            } else {
                FlexItem flexItem = (FlexItem) viewK.getLayoutParams();
                int flexDirection = avhVar.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    f4 = f4;
                    int measuredWidth = viewK.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewK.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.b[i8] && flexItem.H() > f) {
                        float fH = measuredWidth - (f4 * flexItem.H());
                        if (i6 == aVar.h - 1) {
                            fH += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fH);
                        if (iRound < flexItem.J()) {
                            iJ = flexItem.J();
                            this.b[i8] = true;
                            aVar.k -= flexItem.H();
                            z2 = true;
                        } else {
                            float f6 = (fH - iRound) + f5;
                            double d = f6;
                            if (d > 1.0d) {
                                iJ = iRound + 1;
                                f6 -= 1.0f;
                            } else if (d < -1.0d) {
                                iJ = iRound - 1;
                                f6 += 1.0f;
                            } else {
                                iJ = iRound;
                            }
                            f5 = f6;
                        }
                        int iM = m(i2, flexItem, aVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iJ, 1073741824);
                        viewK.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewK.getMeasuredWidth();
                        int measuredHeight2 = viewK.getMeasuredHeight();
                        v(i8, iMakeMeasureSpec, iM, viewK);
                        avhVar.l(i8, viewK);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, avhVar.i(viewK) + measuredHeight + flexItem.V() + flexItem.X0());
                    aVar.e = measuredWidth + flexItem.a1() + flexItem.v1() + aVar.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewK.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewK.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (this.b[i8] || flexItem.H() <= f) {
                        f4 = f4;
                    } else {
                        float fH2 = measuredHeight3 - (flexItem.H() * f4);
                        if (i6 == aVar.h - 1) {
                            fH2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fH2);
                        if (iRound2 < flexItem.x1()) {
                            iX1 = flexItem.x1();
                            this.b[i8] = true;
                            aVar.k -= flexItem.H();
                            z2 = true;
                        } else {
                            float f7 = (fH2 - iRound2) + f5;
                            double d2 = f7;
                            if (d2 > 1.0d) {
                                iX1 = iRound2 + 1;
                                f7 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iX1 = iRound2 - 1;
                                f7 += 1.0f;
                            } else {
                                iX1 = iRound2;
                            }
                            f5 = f7;
                        }
                        int iN = n(i, flexItem, aVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iX1, 1073741824);
                        viewK.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewK.getMeasuredWidth();
                        int measuredHeight4 = viewK.getMeasuredHeight();
                        v(i8, iN, iMakeMeasureSpec2, viewK);
                        avhVar.l(i8, viewK);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, avhVar.i(viewK) + measuredWidth3 + flexItem.a1() + flexItem.v1());
                    aVar.e = measuredHeight3 + flexItem.V() + flexItem.X0() + aVar.e;
                }
                aVar.g = Math.max(aVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
            f4 = f4;
        }
        if (!z2 || i5 == aVar.e) {
            return;
        }
        q(i, i2, aVar, i3, i4, true);
    }

    public final void s(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iA1 = (i - flexItem.a1()) - flexItem.v1();
        avh avhVar = this.a;
        int iMin = Math.min(Math.max(iA1 - avhVar.i(view), flexItem.J()), flexItem.u0());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        v(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        avhVar.l(i2, view);
    }

    public final void t(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iV = (i - flexItem.V()) - flexItem.X0();
        avh avhVar = this.a;
        int iMin = Math.min(Math.max(iV - avhVar.i(view), flexItem.x1()), flexItem.A1());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        v(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        avhVar.l(i2, view);
    }

    public final void u(int i) {
        View viewK;
        avh avhVar = this.a;
        if (i >= avhVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = avhVar.getFlexDirection();
        if (avhVar.getAlignItems() != 4) {
            for (com.google.android.flexbox.a aVar : avhVar.getFlexLinesInternal()) {
                ArrayList arrayList = aVar.n;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Integer num = (Integer) obj;
                    View viewK2 = avhVar.k(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(viewK2, aVar.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            hb5.a(hce0.a(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        s(viewK2, aVar.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.c;
        List<com.google.android.flexbox.a> flexLinesInternal = avhVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i3 = iArr != null ? iArr[i] : 0; i3 < size2; i3++) {
            com.google.android.flexbox.a aVar2 = flexLinesInternal.get(i3);
            int i4 = aVar2.h;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = aVar2.o + i5;
                if (i5 < avhVar.getFlexItemCount() && (viewK = avhVar.k(i6)) != null && viewK.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewK.getLayoutParams();
                    if (flexItem.F() == -1 || flexItem.F() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(viewK, aVar2.g, i6);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                hb5.a(hce0.a(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            s(viewK, aVar2.g, i6);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }
}
