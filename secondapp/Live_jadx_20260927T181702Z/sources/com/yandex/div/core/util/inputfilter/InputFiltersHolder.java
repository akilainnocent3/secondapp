package com.yandex.div.core.util.inputfilter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InputFiltersHolder implements BaseInputFilter {

    @l
    private String currentValue = "";
    private int cursorPosition;

    @l
    private final List<BaseInputFilter> filters;

    /* JADX WARN: Multi-variable type inference failed */
    public InputFiltersHolder(@l List<? extends BaseInputFilter> list) {
        this.filters = list;
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(@l String str) {
        List<BaseInputFilter> list = this.filters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((BaseInputFilter) it.next()).checkValue(str)) {
                return false;
            }
        }
        return true;
    }

    @l
    public final String getCurrentValue() {
        return this.currentValue;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    public final void setCurrentValue(@l String str) {
        this.currentValue = str;
    }

    public final void setCursorPosition(int i10) {
        this.cursorPosition = i10;
    }
}
