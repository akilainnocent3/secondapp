package com.yandex.div.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.div.R;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.div.logging.Severity;
import cs.g;
import cs.k;
import ds.p;
import fr.a0;
import fr.f1;
import fr.h0;
import fr.l0;
import fr.r0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import ms.u;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"RtlHardcoded"})
public class GridContainer extends DivViewGroup {

    @l
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_COLUMN_COUNT = 1;
    private static final int MAX_SIZE = 32768;

    @l
    private static final String TAG = "GridContainer";
    private static final int UNINITIALIZED_HASH = 0;

    @l
    private final Grid grid;
    private boolean initialized;
    private int lastLayoutHashCode;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Cell {

        @g
        public final int columnIndex;

        @g
        public int columnSpan;

        @g
        public final int rowIndex;

        @g
        public int rowSpan;

        @g
        public final int viewIndex;

        public Cell(int i10, int i11, int i12, int i13, int i14) {
            this.viewIndex = i10;
            this.columnIndex = i11;
            this.rowIndex = i12;
            this.columnSpan = i13;
            this.rowSpan = i14;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class CellProjection {

        @g
        public final int contentSize;

        @g
        public final int index;

        @g
        public final int marginEnd;

        @g
        public final int marginStart;

        @g
        public final int span;

        @g
        public final float weight;

        public CellProjection(int i10, int i11, int i12, int i13, int i14, float f10) {
            this.index = i10;
            this.contentSize = i11;
            this.marginStart = i12;
            this.marginEnd = i13;
            this.span = i14;
            this.weight = f10;
        }

        public final int getSize() {
            return this.contentSize + this.marginStart + this.marginEnd;
        }

        public final int getSpecificSize() {
            return getSize() / this.span;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class Grid {

        @l
        private final SizeConstraint heightConstraint;

        @l
        private final SizeConstraint widthConstraint;
        private int columnCount = 1;

        @l
        private final Resettable<List<Cell>> _cells = new Resettable<>(new GridContainer$Grid$_cells$1(this));

        @l
        private final Resettable<List<Line>> _columns = new Resettable<>(new GridContainer$Grid$_columns$1(this));

        @l
        private final Resettable<List<Line>> _rows = new Resettable<>(new GridContainer$Grid$_rows$1(this));

        public Grid() {
            int i10 = 0;
            int i11 = 3;
            x xVar = null;
            this.widthConstraint = new SizeConstraint(i10, i10, i11, xVar);
            this.heightConstraint = new SizeConstraint(i10, i10, i11, xVar);
        }

        private final void adjustWeightedLines(List<Line> list, SizeConstraint sizeConstraint) {
            int size = list.size();
            float weight = 0.0f;
            int size2 = 0;
            float fMax = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                Line line = list.get(i10);
                if (line.isFlexible()) {
                    weight += line.getWeight();
                    fMax = Math.max(fMax, line.getSize() / line.getWeight());
                } else {
                    size2 += line.getSize();
                }
                line.getSize();
            }
            int size3 = list.size();
            int iCeil = 0;
            for (int i11 = 0; i11 < size3; i11++) {
                Line line2 = list.get(i11);
                iCeil += line2.isFlexible() ? (int) Math.ceil(line2.getWeight() * fMax) : line2.getSize();
            }
            float fMax2 = Math.max(0, Math.max(sizeConstraint.min, iCeil) - size2) / weight;
            int size4 = list.size();
            for (int i12 = 0; i12 < size4; i12++) {
                Line line3 = list.get(i12);
                if (line3.isFlexible()) {
                    int iCeil2 = (int) Math.ceil(line3.getWeight() * fMax2);
                    Line.include$default(line3, iCeil2 - line3.getMarginSize(), iCeil2, 0.0f, 4, null);
                }
            }
        }

        private final void align(List<Line> list) {
            int size = list.size();
            int size2 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Line line = list.get(i10);
                line.setOffset(size2);
                size2 += line.getSize();
            }
        }

        private final void applyFixedParamsToLines(List<Cell> list, List<Line> list2, p<? super Cell, ? super View, CellProjection> pVar) {
            int i10;
            GridContainer gridContainer = GridContainer.this;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Cell cell = list.get(i11);
                CellProjection cellProjectionInvoke = pVar.invoke(cell, gridContainer.getChildAt(cell.viewIndex));
                int i12 = cellProjectionInvoke.span;
                if (i12 == 1) {
                    list2.get(cellProjectionInvoke.index).include(cellProjectionInvoke.contentSize, cellProjectionInvoke.getSize(), cellProjectionInvoke.weight);
                } else {
                    int i13 = i12 - 1;
                    float f10 = cellProjectionInvoke.weight / i12;
                    if (i13 >= 0) {
                        while (true) {
                            Line.include$default(list2.get(cellProjectionInvoke.index + i10), 0, 0, f10, 3, null);
                            i10 = i10 != i13 ? i10 + 1 : 0;
                        }
                    }
                }
            }
        }

        private final void applySpansToLines(List<Cell> list, List<Line> list2, p<? super Cell, ? super View, CellProjection> pVar) {
            int size;
            float weight;
            ArrayList arrayList = new ArrayList();
            GridContainer gridContainer = GridContainer.this;
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Cell cell = list.get(i10);
                CellProjection cellProjectionInvoke = pVar.invoke(cell, gridContainer.getChildAt(cell.viewIndex));
                if (cellProjectionInvoke.span > 1) {
                    arrayList.add(cellProjectionInvoke);
                }
            }
            l0.r0(arrayList, SpannedCellComparator.INSTANCE);
            int size3 = arrayList.size();
            for (int i11 = 0; i11 < size3; i11++) {
                CellProjection cellProjection = (CellProjection) arrayList.get(i11);
                int i12 = cellProjection.index;
                int i13 = (cellProjection.span + i12) - 1;
                int size4 = cellProjection.getSize();
                int i14 = 0;
                if (i12 <= i13) {
                    int i15 = i12;
                    size = size4;
                    weight = 0.0f;
                    while (true) {
                        Line line = list2.get(i15);
                        size4 -= line.getSize();
                        if (line.isFlexible()) {
                            weight += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i14++;
                            }
                            size -= line.getSize();
                        }
                        if (i15 == i13) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                } else {
                    size = size4;
                    weight = 0.0f;
                }
                if (weight > 0.0f) {
                    if (i12 <= i13) {
                        while (true) {
                            Line line2 = list2.get(i12);
                            if (line2.isFlexible()) {
                                int iCeil = (int) Math.ceil((line2.getWeight() / weight) * size);
                                Line.include$default(line2, iCeil - line2.getMarginSize(), iCeil, 0.0f, 4, null);
                            }
                            if (i12 != i13) {
                                i12++;
                            }
                        }
                    }
                } else if (size4 > 0 && i12 <= i13) {
                    while (true) {
                        Line line3 = list2.get(i12);
                        if (i14 <= 0) {
                            int i16 = size4 / cellProjection.span;
                            Line.include$default(line3, line3.getContentSize() + i16, line3.getSize() + i16, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i17 = size4 / i14;
                            Line.include$default(line3, line3.getContentSize() + i17, line3.getSize() + i17, 0.0f, 4, null);
                        }
                        if (i12 != i13) {
                            i12++;
                        }
                    }
                }
            }
        }

        private final int calculateSize(List<Line> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Line line = (Line) r0.u3(list);
            return line.getOffset() + line.getSize();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Cell> distributeCells() {
            Integer numValueOf;
            if (GridContainer.this.getChildCount() == 0) {
                return h0.J();
            }
            int i10 = this.columnCount;
            ArrayList arrayList = new ArrayList(GridContainer.this.getChildCount());
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            GridContainer gridContainer = GridContainer.this;
            int childCount = gridContainer.getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = gridContainer.getChildAt(i12);
                if (childAt.getVisibility() != 8) {
                    Integer numWn = a0.wn(iArr2);
                    int iIntValue = numWn != null ? numWn.intValue() : 0;
                    int iQf = a0.Qf(iArr2, iIntValue);
                    int i13 = i11 + iIntValue;
                    ms.l lVarW1 = u.W1(0, i10);
                    int iF = lVarW1.f();
                    int iG = lVarW1.g();
                    if (iF <= iG) {
                        while (true) {
                            iArr2[iF] = Math.max(0, iArr2[iF] - iIntValue);
                            if (iF == iG) {
                                break;
                            }
                            iF++;
                        }
                    }
                    DivViewGroup.Companion companion = DivViewGroup.Companion;
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int iMin = Math.min(divLayoutParams.getColumnSpan(), i10 - iQf);
                    int rowSpan = divLayoutParams.getRowSpan();
                    arrayList.add(new Cell(i12, iQf, i13, iMin, rowSpan));
                    int i14 = iQf + iMin;
                    while (iQf < i14) {
                        if (iArr2[iQf] > 0) {
                            Cell cell = (Cell) arrayList.get(iArr[iQf]);
                            int i15 = cell.columnIndex;
                            int i16 = cell.columnSpan + i15;
                            while (i15 < i16) {
                                int i17 = iArr2[i15];
                                iArr2[i15] = 0;
                                i15++;
                            }
                            cell.rowSpan = i13 - cell.rowIndex;
                        }
                        iArr[iQf] = i12;
                        iArr2[iQf] = rowSpan;
                        iQf++;
                    }
                    i11 = i13;
                }
            }
            if (i10 == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(u.u(iArr2[0], 1));
                f1 it = new ms.l(1, a0.De(iArr2)).iterator();
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(u.u(iArr2[it.nextInt()], 1));
                    if (numValueOf.compareTo(numValueOf2) > 0) {
                        numValueOf = numValueOf2;
                    }
                }
            }
            int iIntValue2 = ((Cell) r0.u3(arrayList)).rowIndex + (numValueOf != null ? numValueOf.intValue() : 1);
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                Cell cell2 = (Cell) arrayList.get(i18);
                int i19 = cell2.rowIndex;
                if (cell2.rowSpan + i19 > iIntValue2) {
                    cell2.rowSpan = iIntValue2 - i19;
                }
            }
            return arrayList;
        }

        private final int getHeight() {
            return calculateSize(getRows());
        }

        private final int getWidth() {
            return calculateSize(getColumns());
        }

        private final List<Line> measureAxis(int i10, SizeConstraint sizeConstraint, p<? super Cell, ? super View, CellProjection> pVar) {
            int size;
            float weight;
            int i11;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(i10);
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                Cell cell = list.get(i13);
                CellProjection cellProjectionInvoke = pVar.invoke(cell, gridContainer.getChildAt(cell.viewIndex));
                int i14 = cellProjectionInvoke.span;
                if (i14 == 1) {
                    ((Line) arrayList.get(cellProjectionInvoke.index)).include(cellProjectionInvoke.contentSize, cellProjectionInvoke.getSize(), cellProjectionInvoke.weight);
                } else {
                    int i15 = i14 - 1;
                    float f10 = cellProjectionInvoke.weight / i14;
                    if (i15 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjectionInvoke.index + i11), 0, 0, f10, 3, null);
                            i11 = i11 != i15 ? i11 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size3 = list.size();
            for (int i16 = 0; i16 < size3; i16++) {
                Cell cell2 = list.get(i16);
                CellProjection cellProjectionInvoke2 = pVar.invoke(cell2, gridContainer2.getChildAt(cell2.viewIndex));
                if (cellProjectionInvoke2.span > 1) {
                    arrayList2.add(cellProjectionInvoke2);
                }
            }
            l0.r0(arrayList2, SpannedCellComparator.INSTANCE);
            int size4 = arrayList2.size();
            for (int i17 = 0; i17 < size4; i17++) {
                CellProjection cellProjection = (CellProjection) arrayList2.get(i17);
                int i18 = cellProjection.index;
                int i19 = (cellProjection.span + i18) - 1;
                int size5 = cellProjection.getSize();
                int i20 = 0;
                if (i18 <= i19) {
                    int i21 = i18;
                    size = size5;
                    weight = 0.0f;
                    while (true) {
                        Line line = (Line) arrayList.get(i21);
                        size5 -= line.getSize();
                        if (line.isFlexible()) {
                            weight += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i20++;
                            }
                            size -= line.getSize();
                        }
                        if (i21 == i19) {
                            break;
                        }
                        i21++;
                    }
                } else {
                    size = size5;
                    weight = 0.0f;
                }
                if (weight > 0.0f) {
                    if (i18 <= i19) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i18);
                            if (line2.isFlexible()) {
                                int iCeil = (int) Math.ceil((line2.getWeight() / weight) * size);
                                Line.include$default(line2, iCeil - line2.getMarginSize(), iCeil, 0.0f, 4, null);
                            }
                            if (i18 != i19) {
                                i18++;
                            }
                        }
                    }
                } else if (size5 > 0 && i18 <= i19) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i18);
                        if (i20 <= 0) {
                            int i22 = size5 / cellProjection.span;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i23 = size5 / i20;
                            Line.include$default(line3, line3.getContentSize() + i23, line3.getSize() + i23, 0.0f, 4, null);
                        }
                        if (i18 != i19) {
                            i18++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureColumns() {
            int size;
            float weight;
            int i10;
            int i11;
            int i12 = this.columnCount;
            SizeConstraint sizeConstraint = this.widthConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                Cell cell = list.get(i14);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                CellProjection cellProjection = new CellProjection(cell.columnIndex, childAt.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin, cell.columnSpan, GridContainerKt.getColumnWeight(divLayoutParams));
                int i15 = cellProjection.span;
                if (i15 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i16 = i15 - 1;
                    float f10 = cellProjection.weight / i15;
                    if (i16 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i11), 0, 0, f10, 3, null);
                            i11 = i11 != i16 ? i11 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size3 = list.size();
            for (int i17 = 0; i17 < size3; i17++) {
                Cell cell2 = list.get(i17);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                m0.n(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                CellProjection cellProjection2 = new CellProjection(cell2.columnIndex, childAt2.getMeasuredWidth(), ((ViewGroup.MarginLayoutParams) divLayoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams2).rightMargin, cell2.columnSpan, GridContainerKt.getColumnWeight(divLayoutParams2));
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            l0.r0(arrayList2, SpannedCellComparator.INSTANCE);
            int size4 = arrayList2.size();
            for (int i18 = 0; i18 < size4; i18++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i18);
                int i19 = cellProjection3.index;
                int i20 = (cellProjection3.span + i19) - 1;
                int size5 = cellProjection3.getSize();
                if (i19 <= i20) {
                    int i21 = i19;
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i21);
                        size5 -= line.getSize();
                        if (line.isFlexible()) {
                            weight += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i10++;
                            }
                            size -= line.getSize();
                        }
                        if (i21 == i20) {
                            break;
                        }
                        i21++;
                    }
                } else {
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                }
                if (weight > 0.0f) {
                    if (i19 <= i20) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i19);
                            if (line2.isFlexible()) {
                                int iCeil = (int) Math.ceil((line2.getWeight() / weight) * size);
                                Line.include$default(line2, iCeil - line2.getMarginSize(), iCeil, 0.0f, 4, null);
                            }
                            if (i19 != i20) {
                                i19++;
                            }
                        }
                    }
                } else if (size5 > 0 && i19 <= i20) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i19);
                        if (i10 <= 0) {
                            int i22 = size5 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i23 = size5 / i10;
                            Line.include$default(line3, line3.getContentSize() + i23, line3.getSize() + i23, 0.0f, 4, null);
                        }
                        if (i19 != i20) {
                            i19++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureRows() {
            int size;
            float weight;
            int i10;
            int i11;
            int rowCount = getRowCount();
            SizeConstraint sizeConstraint = this.heightConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(rowCount);
            for (int i12 = 0; i12 < rowCount; i12++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                Cell cell = list.get(i13);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                CellProjection cellProjection = new CellProjection(cell.rowIndex, childAt.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin, cell.rowSpan, GridContainerKt.getRowWeight(divLayoutParams));
                int i14 = cellProjection.span;
                if (i14 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i15 = i14 - 1;
                    float f10 = cellProjection.weight / i14;
                    if (i15 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i11), 0, 0, f10, 3, null);
                            i11 = i11 != i15 ? i11 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size3 = list.size();
            for (int i16 = 0; i16 < size3; i16++) {
                Cell cell2 = list.get(i16);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.Companion;
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                m0.n(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                CellProjection cellProjection2 = new CellProjection(cell2.rowIndex, childAt2.getMeasuredHeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) divLayoutParams2).bottomMargin, cell2.rowSpan, GridContainerKt.getRowWeight(divLayoutParams2));
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            l0.r0(arrayList2, SpannedCellComparator.INSTANCE);
            int size4 = arrayList2.size();
            for (int i17 = 0; i17 < size4; i17++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i17);
                int i18 = cellProjection3.index;
                int i19 = (cellProjection3.span + i18) - 1;
                int size5 = cellProjection3.getSize();
                if (i18 <= i19) {
                    int i20 = i18;
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i20);
                        size5 -= line.getSize();
                        if (line.isFlexible()) {
                            weight += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i10++;
                            }
                            size -= line.getSize();
                        }
                        if (i20 == i19) {
                            break;
                        }
                        i20++;
                    }
                } else {
                    size = size5;
                    weight = 0.0f;
                    i10 = 0;
                }
                if (weight > 0.0f) {
                    if (i18 <= i19) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i18);
                            if (line2.isFlexible()) {
                                int iCeil = (int) Math.ceil((line2.getWeight() / weight) * size);
                                Line.include$default(line2, iCeil - line2.getMarginSize(), iCeil, 0.0f, 4, null);
                            }
                            if (i18 != i19) {
                                i18++;
                            }
                        }
                    }
                } else if (size5 > 0 && i18 <= i19) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i18);
                        if (i10 <= 0) {
                            int i21 = size5 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i21, line3.getSize() + i21, 0.0f, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i22 = size5 / i10;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, 0.0f, 4, null);
                        }
                        if (i18 != i19) {
                            i18++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        private final int rowCount(List<Cell> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Cell cell = (Cell) r0.u3(list);
            return cell.rowIndex + cell.rowSpan;
        }

        @l
        public final List<Cell> getCells() {
            return this._cells.get();
        }

        public final int getColumnCount() {
            return this.columnCount;
        }

        @l
        public final List<Line> getColumns() {
            return this._columns.get();
        }

        public final int getMeasuredHeight() {
            if (this._rows.getInitialized()) {
                return calculateSize(this._rows.get());
            }
            return 0;
        }

        public final int getMeasuredWidth() {
            if (this._columns.getInitialized()) {
                return calculateSize(this._columns.get());
            }
            return 0;
        }

        public final int getRowCount() {
            return rowCount(getCells());
        }

        @l
        public final List<Line> getRows() {
            return this._rows.get();
        }

        public final void invalidateMeasurement() {
            this._columns.reset();
            this._rows.reset();
        }

        public final void invalidateStructure() {
            this._cells.reset();
            invalidateMeasurement();
        }

        public final int measureHeight(int i10) {
            this.heightConstraint.set(i10);
            return Math.max(this.heightConstraint.min, Math.min(getHeight(), this.heightConstraint.max));
        }

        public final int measureWidth(int i10) {
            this.widthConstraint.set(i10);
            return Math.max(this.widthConstraint.min, Math.min(getWidth(), this.widthConstraint.max));
        }

        public final void setColumnCount(int i10) {
            if (i10 <= 0 || this.columnCount == i10) {
                return;
            }
            this.columnCount = i10;
            invalidateStructure();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Line {
        private int contentSize;
        private int offset;
        private int size;
        private float weight;

        public static /* synthetic */ void include$default(Line line, int i10, int i11, float f10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            line.include(i10, i11, f10);
        }

        public final int getContentSize() {
            return this.contentSize;
        }

        public final int getMarginSize() {
            return this.size - this.contentSize;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getSize() {
            return this.size;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final void include(int i10, int i11, float f10) {
            this.contentSize = Math.max(this.contentSize, i10);
            this.size = Math.max(this.size, i11);
            this.weight = Math.max(this.weight, f10);
        }

        public final boolean isFlexible() {
            return this.weight > 0.0f;
        }

        public final void setOffset(int i10) {
            this.offset = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class SizeConstraint {

        @g
        public int max;

        @g
        public int min;

        /* JADX WARN: Illegal instructions before constructor call */
        public SizeConstraint() {
            int i10 = 0;
            this(i10, i10, 3, null);
        }

        public final void set(int i10) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == Integer.MIN_VALUE) {
                this.min = 0;
                this.max = size;
            } else if (mode == 0) {
                this.min = 0;
                this.max = 32768;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.min = size;
                this.max = size;
            }
        }

        public SizeConstraint(int i10, int i11) {
            this.min = i10;
            this.max = i11;
        }

        public /* synthetic */ SizeConstraint(int i10, int i11, int i12, x xVar) {
            this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 32768 : i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class SpannedCellComparator implements Comparator<CellProjection> {

        @l
        public static final SpannedCellComparator INSTANCE = new SpannedCellComparator();

        private SpannedCellComparator() {
        }

        @Override // java.util.Comparator
        public int compare(@l CellProjection cellProjection, @l CellProjection cellProjection2) {
            if (cellProjection.getSpecificSize() < cellProjection2.getSpecificSize()) {
                return 1;
            }
            return cellProjection.getSpecificSize() > cellProjection2.getSpecificSize() ? -1 : 0;
        }
    }

    @k
    public GridContainer(@l Context context) {
        this(context, null, 0, 6, null);
    }

    private final int bottom(Cell cell, List<Line> list) {
        Line line = list.get((cell.rowIndex + cell.rowSpan) - 1);
        return line.getOffset() + line.getSize();
    }

    private final int calculateChildHorizontalPosition(int i10, int i11, int i12, int i13) {
        int i14 = i13 & 7;
        if (i14 != 1) {
            return i14 != 5 ? i10 : (i10 + i11) - i12;
        }
        return i10 + ((i11 - i12) / 2);
    }

    private final int calculateChildVerticalPosition(int i10, int i11, int i12, int i13) {
        int i14 = i13 & 112;
        if (i14 != 16) {
            return i14 != 80 ? i10 : (i10 + i11) - i12;
        }
        return i10 + ((i11 - i12) / 2);
    }

    private final int calculateGridHorizontalPosition() {
        int gravity = getGravity() & 7;
        int measuredWidth = this.grid.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (gravity != 1) {
            return gravity != 5 ? getPaddingLeft() : (getPaddingLeft() + measuredWidth2) - measuredWidth;
        }
        return getPaddingLeft() + ((measuredWidth2 - measuredWidth) / 2);
    }

    private final int calculateGridVerticalPosition() {
        int gravity = getGravity() & 112;
        int measuredHeight = this.grid.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (gravity != 16) {
            return gravity != 80 ? getPaddingTop() : (getPaddingTop() + measuredHeight2) - measuredHeight;
        }
        return getPaddingTop() + ((measuredHeight2 - measuredHeight) / 2);
    }

    private final void checkConsistency() {
        int i10 = this.lastLayoutHashCode;
        if (i10 == 0) {
            validateLayoutParams();
            this.lastLayoutHashCode = computeLayoutHashCode();
        } else if (i10 != computeLayoutHashCode()) {
            invalidateStructure();
            checkConsistency();
        }
    }

    private final int computeLayoutHashCode() {
        int childCount = getChildCount();
        int iHashCode = Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                iHashCode = (iHashCode * 31) + ((DivLayoutParams) layoutParams).hashCode();
            }
        }
        return iHashCode;
    }

    private final int getPaddingHorizontal() {
        return getPaddingLeft() + getPaddingRight();
    }

    private final int getPaddingVertical() {
        return getPaddingTop() + getPaddingBottom();
    }

    private final int height(Cell cell, List<Line> list) {
        Line line = list.get((cell.rowIndex + cell.rowSpan) - 1);
        return (line.getOffset() + line.getSize()) - list.get(cell.rowIndex).getOffset();
    }

    private final void invalidateMeasurement() {
        this.grid.invalidateMeasurement();
    }

    private final void invalidateStructure() {
        this.lastLayoutHashCode = 0;
        this.grid.invalidateStructure();
    }

    private final int left(Cell cell, List<Line> list) {
        return list.get(cell.columnIndex).getOffset();
    }

    private final void measureChild(View view, int i10, int i11, int i12, int i13) {
        DivViewGroup.Companion companion = DivViewGroup.Companion;
        int minimumWidth = view.getMinimumWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        int childMeasureSpec = companion.getChildMeasureSpec(i10, 0, i12, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        int minimumHeight = view.getMinimumHeight();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        m0.n(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        view.measure(childMeasureSpec, companion.getChildMeasureSpec(i11, 0, i13, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight()));
    }

    private final void measureChildrenInitial(int i10, int i11) {
        int childCount = getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int i13 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                int i14 = i13 == -1 ? 0 : i13;
                int i15 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
                measureChild(childAt, i10, i11, i14, i15 == -1 ? 0 : i15);
            } else {
                i10 = i10;
                i11 = i11;
            }
            i12++;
            i10 = i10;
            i11 = i11;
        }
    }

    private final void measureMatchParentChild(View view, int i10, int i11, int i12, int i13, int i14, int i15) {
        int childMeasureSpec;
        int childMeasureSpec2;
        if (i12 == -1) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else {
            DivViewGroup.Companion companion = DivViewGroup.Companion;
            int minimumWidth = view.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec = companion.getChildMeasureSpec(i10, 0, i12, minimumWidth, ((DivLayoutParams) layoutParams).getMaxWidth());
        }
        if (i13 == -1) {
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            DivViewGroup.Companion companion2 = DivViewGroup.Companion;
            int minimumHeight = view.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            m0.n(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            childMeasureSpec2 = companion2.getChildMeasureSpec(i11, 0, i13, minimumHeight, ((DivLayoutParams) layoutParams2).getMaxHeight());
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final void remeasureChildrenHeight(int i10, int i11) {
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    Cell cell = cells.get(i12);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                    measureMatchParentChild(childAt, i10, i11, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, ((line2.getOffset() + line2.getSize()) - rows.get(cell.rowIndex).getOffset()) - divLayoutParams.getVerticalMargins$div_release());
                }
                i12++;
            }
        }
    }

    private final void remeasureChildrenWidth(int i10, int i11) {
        int i12;
        int i13;
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
                    i15++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    Cell cell = cells.get(i15);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    i12 = i10;
                    i13 = i11;
                    measureMatchParentChild(childAt, i12, i13, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, 0);
                    i15++;
                }
            } else {
                i12 = i10;
                i13 = i11;
            }
            i14++;
            i10 = i12;
            i11 = i13;
        }
    }

    private final int right(Cell cell, List<Line> list) {
        Line line = list.get((cell.columnIndex + cell.columnSpan) - 1);
        return line.getOffset() + line.getSize();
    }

    private final int top(Cell cell, List<Line> list) {
        return list.get(cell.rowIndex).getOffset();
    }

    private final void validateLayoutParams() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i10).getLayoutParams();
            m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getColumnSpan() < 0 || divLayoutParams.getRowSpan() < 0) {
                throw new IllegalStateException("Negative spans are not supported.");
            }
            if (GridContainerKt.getColumnWeight(divLayoutParams) < 0.0f || GridContainerKt.getRowWeight(divLayoutParams) < 0.0f) {
                throw new IllegalStateException("Negative weights are not supported.");
            }
        }
    }

    private final int width(Cell cell, List<Line> list) {
        Line line = list.get((cell.columnIndex + cell.columnSpan) - 1);
        return (line.getOffset() + line.getSize()) - list.get(cell.columnIndex).getOffset();
    }

    public final int getColumnCount() {
        return this.grid.getColumnCount();
    }

    public final int getRowCount() {
        return this.grid.getRowCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        List<Cell> cells = this.grid.getCells();
        int iCalculateGridHorizontalPosition = calculateGridHorizontalPosition();
        int iCalculateGridVerticalPosition = calculateGridVerticalPosition();
        int childCount = getChildCount();
        int i14 = 0;
        int i15 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                Cell cell = cells.get(i15);
                int offset = columns.get(cell.columnIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                int offset2 = rows.get(cell.rowIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                int offset3 = ((line.getOffset() + line.getSize()) - offset) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                int offset4 = ((line2.getOffset() + line2.getSize()) - offset2) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                int iCalculateChildHorizontalPosition = calculateChildHorizontalPosition(offset, offset3, childAt.getMeasuredWidth(), divLayoutParams.getGravity()) + iCalculateGridHorizontalPosition;
                int iCalculateChildVerticalPosition = calculateChildVerticalPosition(offset2, offset4, childAt.getMeasuredHeight(), divLayoutParams.getGravity()) + iCalculateGridVerticalPosition;
                childAt.layout(iCalculateChildHorizontalPosition, iCalculateChildVerticalPosition, childAt.getMeasuredWidth() + iCalculateChildHorizontalPosition, childAt.getMeasuredHeight() + iCalculateChildVerticalPosition);
                i15++;
            }
            i14++;
            jElapsedRealtime = jElapsedRealtime;
            columns = columns;
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, TAG, "onLayout() performed in " + jElapsedRealtime2 + " ms");
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        invalidateMeasurement();
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - paddingHorizontal), View.MeasureSpec.getMode(i10));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11 - paddingVertical), View.MeasureSpec.getMode(i11));
        measureChildrenInitial(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMeasureWidth = this.grid.measureWidth(iMakeMeasureSpec);
        remeasureChildrenWidth(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMeasureHeight = this.grid.measureHeight(iMakeMeasureSpec2);
        remeasureChildrenHeight(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMeasureWidth + paddingHorizontal, getSuggestedMinimumWidth()), i10, 0), View.resolveSizeAndState(Math.max(iMeasureHeight + paddingVertical, getSuggestedMinimumHeight()), i11, 0));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, TAG, "onMeasure() performed in " + jElapsedRealtime2 + " ms");
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(@l View view) {
        super.onViewAdded(view);
        invalidateStructure();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@l View view) {
        super.onViewRemoved(view);
        invalidateStructure();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.initialized) {
            invalidateMeasurement();
        }
    }

    public final void setColumnCount(int i10) {
        this.grid.setColumnCount(i10);
        invalidateStructure();
        requestLayout();
    }

    @k
    public GridContainer(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ GridContainer(Context context, AttributeSet attributeSet, int i10, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @k
    public GridContainer(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.grid = new Grid();
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GridContainer, i10, 0);
            try {
                setColumnCount(typedArrayObtainStyledAttributes.getInt(R.styleable.GridContainer_android_columnCount, 1));
                setGravity(typedArrayObtainStyledAttributes.getInt(R.styleable.GridContainer_android_gravity, 8388659));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.initialized = true;
    }
}
