package com.yandex.div.core.util.mask;

import cv.v;
import cv.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import ms.u;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseInputMask {
    private int cursorPosition;
    protected List<? extends MaskChar> destructedValue;

    @l
    private final Map<Character, v> filters = new LinkedHashMap();

    @l
    private MaskData maskData;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class MaskChar {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Dynamic extends MaskChar {

            /* JADX INFO: renamed from: char, reason: not valid java name */
            @m
            private Character f3260char;

            @m
            private final v filter;
            private final char placeholder;

            public Dynamic(@m Character ch2, @m v vVar, char c10) {
                super(null);
                this.f3260char = ch2;
                this.filter = vVar;
                this.placeholder = c10;
            }

            public static /* synthetic */ Dynamic copy$default(Dynamic dynamic, Character ch2, v vVar, char c10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    ch2 = dynamic.f3260char;
                }
                if ((i10 & 2) != 0) {
                    vVar = dynamic.filter;
                }
                if ((i10 & 4) != 0) {
                    c10 = dynamic.placeholder;
                }
                return dynamic.copy(ch2, vVar, c10);
            }

            @m
            public final Character component1() {
                return this.f3260char;
            }

            @m
            public final v component2() {
                return this.filter;
            }

            public final char component3() {
                return this.placeholder;
            }

            @l
            public final Dynamic copy(@m Character ch2, @m v vVar, char c10) {
                return new Dynamic(ch2, vVar, c10);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) obj;
                return m0.g(this.f3260char, dynamic.f3260char) && m0.g(this.filter, dynamic.filter) && this.placeholder == dynamic.placeholder;
            }

            @m
            public final Character getChar() {
                return this.f3260char;
            }

            @m
            public final v getFilter() {
                return this.filter;
            }

            public final char getPlaceholder() {
                return this.placeholder;
            }

            public int hashCode() {
                Character ch2 = this.f3260char;
                int iHashCode = (ch2 == null ? 0 : ch2.hashCode()) * 31;
                v vVar = this.filter;
                return ((iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31) + this.placeholder;
            }

            public final void setChar(@m Character ch2) {
                this.f3260char = ch2;
            }

            @l
            public String toString() {
                return "Dynamic(char=" + this.f3260char + ", filter=" + this.filter + ", placeholder=" + this.placeholder + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Static extends MaskChar {

            /* JADX INFO: renamed from: char, reason: not valid java name */
            private final char f3261char;

            public Static(char c10) {
                super(null);
                this.f3261char = c10;
            }

            public static /* synthetic */ Static copy$default(Static r10, char c10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    c10 = r10.f3261char;
                }
                return r10.copy(c10);
            }

            public final char component1() {
                return this.f3261char;
            }

            @l
            public final Static copy(char c10) {
                return new Static(c10);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Static) && this.f3261char == ((Static) obj).f3261char;
            }

            public final char getChar() {
                return this.f3261char;
            }

            public int hashCode() {
                return this.f3261char;
            }

            @l
            public String toString() {
                return "Static(char=" + this.f3261char + ')';
            }
        }

        public /* synthetic */ MaskChar(x xVar) {
            this();
        }

        private MaskChar() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class MaskData {
        private final boolean alwaysVisible;

        @l
        private final List<MaskKey> decoding;

        @l
        private final String pattern;

        public MaskData(@l String str, @l List<MaskKey> list, boolean z10) {
            this.pattern = str;
            this.decoding = list;
            this.alwaysVisible = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MaskData copy$default(MaskData maskData, String str, List list, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = maskData.pattern;
            }
            if ((i10 & 2) != 0) {
                list = maskData.decoding;
            }
            if ((i10 & 4) != 0) {
                z10 = maskData.alwaysVisible;
            }
            return maskData.copy(str, list, z10);
        }

        @l
        public final String component1() {
            return this.pattern;
        }

        @l
        public final List<MaskKey> component2() {
            return this.decoding;
        }

        public final boolean component3() {
            return this.alwaysVisible;
        }

        @l
        public final MaskData copy(@l String str, @l List<MaskKey> list, boolean z10) {
            return new MaskData(str, list, z10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaskData)) {
                return false;
            }
            MaskData maskData = (MaskData) obj;
            return m0.g(this.pattern, maskData.pattern) && m0.g(this.decoding, maskData.decoding) && this.alwaysVisible == maskData.alwaysVisible;
        }

        public final boolean getAlwaysVisible() {
            return this.alwaysVisible;
        }

        @l
        public final List<MaskKey> getDecoding() {
            return this.decoding;
        }

        @l
        public final String getPattern() {
            return this.pattern;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int iHashCode = ((this.pattern.hashCode() * 31) + this.decoding.hashCode()) * 31;
            boolean z10 = this.alwaysVisible;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        @l
        public String toString() {
            return "MaskData(pattern=" + this.pattern + ", decoding=" + this.decoding + ", alwaysVisible=" + this.alwaysVisible + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class MaskKey {

        @m
        private final String filter;
        private final char key;
        private final char placeholder;

        public MaskKey(char c10, @m String str, char c11) {
            this.key = c10;
            this.filter = str;
            this.placeholder = c11;
        }

        @m
        public final String getFilter() {
            return this.filter;
        }

        public final char getKey() {
            return this.key;
        }

        public final char getPlaceholder() {
            return this.placeholder;
        }
    }

    public BaseInputMask(@l MaskData maskData) {
        this.maskData = maskData;
        updateMaskData$default(this, maskData, false, 2, null);
    }

    public static /* synthetic */ void applyChangeFrom$default(BaseInputMask baseInputMask, String str, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyChangeFrom");
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        baseInputMask.applyChangeFrom(str, num);
    }

    private final String buildBodySubstring(TextDiff textDiff, String str) {
        String strSubstring = str.substring(textDiff.getStart(), textDiff.getStart() + textDiff.getAdded());
        m0.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final String buildTailSubstring(TextDiff textDiff) {
        return collectValueRange(textDiff.getStart() + textDiff.getRemoved(), getDestructedValue().size() - 1);
    }

    private final int calculateMaxShift(String str, int i10) {
        int length;
        if (this.filters.size() <= 1) {
            int i11 = 0;
            while (i10 < getDestructedValue().size()) {
                if (getDestructedValue().get(i10) instanceof MaskChar.Dynamic) {
                    i11++;
                }
                i10++;
            }
            length = i11 - str.length();
        } else {
            String strCalculateInsertableSubstring = calculateInsertableSubstring(str, i10);
            int i12 = 0;
            while (i12 < getDestructedValue().size() && m0.g(strCalculateInsertableSubstring, calculateInsertableSubstring(str, i10 + i12))) {
                i12++;
            }
            length = i12 - 1;
        }
        return u.u(length, 0);
    }

    public static /* synthetic */ void replaceChars$default(BaseInputMask baseInputMask, String str, int i10, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceChars");
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        baseInputMask.replaceChars(str, i10, num);
    }

    public static /* synthetic */ void updateMaskData$default(BaseInputMask baseInputMask, MaskData maskData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMaskData");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        baseInputMask.updateMaskData(maskData, z10);
    }

    public void applyChangeFrom(@l String str, @m Integer num) {
        TextDiff textDiffBuild = TextDiff.Companion.build(getValue(), str);
        if (num != null) {
            textDiffBuild = new TextDiff(u.u(num.intValue() - textDiffBuild.getAdded(), 0), textDiffBuild.getAdded(), textDiffBuild.getRemoved());
        }
        calculateCursorPosition(textDiffBuild, replaceBodyTail(textDiffBuild, str));
    }

    public final void calculateCursorPosition(@l TextDiff textDiff, int i10) {
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        if (textDiff.getStart() < firstEmptyHolderIndex) {
            firstEmptyHolderIndex = Math.min(firstHolderAfter(i10), getValue().length());
        }
        this.cursorPosition = firstEmptyHolderIndex;
    }

    @l
    public final String calculateInsertableSubstring(@l String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        l1.f fVar = new l1.f();
        fVar.f102747b = i10;
        BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1 baseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1 = new BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1(fVar, this);
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            v vVarInvoke = baseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1.invoke();
            if (vVarInvoke != null && vVarInvoke.m(String.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                fVar.f102747b++;
            }
        }
        return sb2.toString();
    }

    public final void cleanup(@l TextDiff textDiff) {
        if (textDiff.getAdded() == 0 && textDiff.getRemoved() == 1) {
            for (int start = textDiff.getStart(); start >= 0; start--) {
                MaskChar maskChar = getDestructedValue().get(start);
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        dynamic.setChar(null);
                        break;
                    }
                }
            }
        }
        clearRange(textDiff.getStart(), getDestructedValue().size());
    }

    public final void clearRange(int i10, int i11) {
        while (i10 < i11 && i10 < getDestructedValue().size()) {
            MaskChar maskChar = getDestructedValue().get(i10);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(null);
            }
            i10++;
        }
    }

    @l
    public final String collectValueRange(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= i11) {
            MaskChar maskChar = getDestructedValue().get(i10);
            if (maskChar instanceof MaskChar.Dynamic) {
                MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                if (dynamic.getChar() != null) {
                    sb2.append(dynamic.getChar());
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public final int firstHolderAfter(int i10) {
        while (i10 < getDestructedValue().size() && !(getDestructedValue().get(i10) instanceof MaskChar.Dynamic)) {
            i10++;
        }
        return i10;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    @l
    public final List<MaskChar> getDestructedValue() {
        List list = this.destructedValue;
        if (list != null) {
            return list;
        }
        m0.S("destructedValue");
        return null;
    }

    @l
    public final Map<Character, v> getFilters() {
        return this.filters;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    public final int getFirstEmptyHolderIndex() {
        int i10 = 0;
        for (MaskChar maskChar : getDestructedValue()) {
            if ((maskChar instanceof MaskChar.Dynamic) && ((MaskChar.Dynamic) maskChar).getChar() == null) {
                if (i10 != -1) {
                    return i10;
                }
                return getDestructedValue().size();
            }
            i10++;
        }
        i10 = -1;
        if (i10 != -1) {
            return i10;
        }
        return getDestructedValue().size();
    }

    @l
    public final MaskData getMaskData() {
        return this.maskData;
    }

    @l
    public final String getRawValue() {
        return collectValueRange(0, getDestructedValue().size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e A[EDGE_INSN: B:20:0x005e->B:17:0x005e BREAK  A[LOOP:0: B:3:0x0014->B:16:0x005a], SYNTHETIC] */
    @l
    public final String getValue() {
        StringBuilder sb2 = new StringBuilder();
        List<MaskChar> destructedValue = getDestructedValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : destructedValue) {
            MaskChar maskChar = (MaskChar) obj;
            if (maskChar instanceof MaskChar.Static) {
                sb2.append(((MaskChar.Static) maskChar).getChar());
            } else if (!(maskChar instanceof MaskChar.Dynamic)) {
                if (this.maskData.getAlwaysVisible()) {
                    break;
                    break;
                }
                m0.n(maskChar, "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic");
                sb2.append(((MaskChar.Dynamic) maskChar).getPlaceholder());
            } else {
                MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                if (dynamic.getChar() == null) {
                    if (this.maskData.getAlwaysVisible()) {
                        break;
                    }
                    m0.n(maskChar, "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic");
                    sb2.append(((MaskChar.Dynamic) maskChar).getPlaceholder());
                } else {
                    sb2.append(dynamic.getChar());
                }
            }
            arrayList.add(obj);
        }
        return sb2.toString();
    }

    public abstract void onException(@l Exception exc);

    public void overrideRawValue(@l String str) {
        clearRange(0, getDestructedValue().size());
        replaceChars$default(this, str, 0, null, 4, null);
        this.cursorPosition = Math.min(this.cursorPosition, getValue().length());
    }

    public final int replaceBodyTail(@l TextDiff textDiff, @l String str) {
        String strBuildBodySubstring = buildBodySubstring(textDiff, str);
        String strBuildTailSubstring = buildTailSubstring(textDiff);
        cleanup(textDiff);
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        replaceChars(strBuildBodySubstring, firstEmptyHolderIndex, strBuildTailSubstring.length() == 0 ? null : Integer.valueOf(calculateMaxShift(strBuildTailSubstring, firstEmptyHolderIndex)));
        int firstEmptyHolderIndex2 = getFirstEmptyHolderIndex();
        replaceChars$default(this, strBuildTailSubstring, firstEmptyHolderIndex2, null, 4, null);
        return firstEmptyHolderIndex2;
    }

    public final void replaceChars(@l String str, int i10, @m Integer num) {
        String strCalculateInsertableSubstring = calculateInsertableSubstring(str, i10);
        if (num != null) {
            strCalculateInsertableSubstring = w0.A9(strCalculateInsertableSubstring, num.intValue());
        }
        int i11 = 0;
        while (i10 < getDestructedValue().size() && i11 < strCalculateInsertableSubstring.length()) {
            MaskChar maskChar = getDestructedValue().get(i10);
            char cCharAt = strCalculateInsertableSubstring.charAt(i11);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(Character.valueOf(cCharAt));
                i11++;
            }
            i10++;
        }
    }

    public final void setCursorPosition(int i10) {
        this.cursorPosition = i10;
    }

    public final void setDestructedValue(@l List<? extends MaskChar> list) {
        this.destructedValue = list;
    }

    public void updateMaskData(@l MaskData maskData, boolean z10) {
        Object next;
        String rawValue = (m0.g(this.maskData, maskData) || !z10) ? null : getRawValue();
        this.maskData = maskData;
        this.filters.clear();
        for (MaskKey maskKey : this.maskData.getDecoding()) {
            try {
                String filter = maskKey.getFilter();
                if (filter != null) {
                    this.filters.put(Character.valueOf(maskKey.getKey()), new v(filter));
                }
            } catch (PatternSyntaxException e10) {
                onException(e10);
            }
        }
        String pattern = this.maskData.getPattern();
        ArrayList arrayList = new ArrayList(pattern.length());
        for (int i10 = 0; i10 < pattern.length(); i10++) {
            char cCharAt = pattern.charAt(i10);
            Iterator<T> it = this.maskData.getDecoding().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((MaskKey) next).getKey() != cCharAt);
            MaskKey maskKey2 = (MaskKey) next;
            arrayList.add(maskKey2 != null ? new MaskChar.Dynamic(null, this.filters.get(Character.valueOf(maskKey2.getKey())), maskKey2.getPlaceholder()) : new MaskChar.Static(cCharAt));
        }
        setDestructedValue(arrayList);
        if (rawValue != null) {
            overrideRawValue(rawValue);
        }
    }
}
