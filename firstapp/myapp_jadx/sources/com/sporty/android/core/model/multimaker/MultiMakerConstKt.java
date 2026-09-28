package com.sporty.android.core.model.multimaker;

import android.util.Range;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u000e\u0010\u0013\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"ID_SELECT_ALL", "", "DEFAULT_INIT_SELECTION_NUM_SELECTION_ODDS", "", "DEFAULT_INIT_SELECTION_NUM_TOTAL_ODDS", "DEFAULT_INIT_SELECTION_NUM_INPUT", "DEFAULT_MAX_SELECTION_NUM", "SEEK_BAR_PROGRESS_SELECTION_ODDS_MIN", "", "SEEK_BAR_PROGRESS_SELECTION_ODDS_MAX", "selectionOddsSeekBarProgressBoundary", "Landroid/util/Range;", "kotlin.jvm.PlatformType", "getSelectionOddsSeekBarProgressBoundary", "()Landroid/util/Range;", "DEFAULT_SELECTION_ODDS_MIN", "DEFAULT_SELECTION_ODDS_MAX", "defaultSelectionOddsBoundary", "getDefaultSelectionOddsBoundary", "DEFAULT_PROGRESS_TOTAL_ODDS_MIN", "DEFAULT_PROGRESS_TOTAL_ODDS_MAX", "defaultTotalOddsBoundary", "getDefaultTotalOddsBoundary", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class MultiMakerConstKt {
    public static final int DEFAULT_INIT_SELECTION_NUM_INPUT = 2;
    public static final int DEFAULT_INIT_SELECTION_NUM_SELECTION_ODDS = 5;
    public static final int DEFAULT_INIT_SELECTION_NUM_TOTAL_ODDS = 2;
    public static final int DEFAULT_MAX_SELECTION_NUM = 50;
    public static final float DEFAULT_PROGRESS_TOTAL_ODDS_MAX = 100.0f;
    public static final float DEFAULT_PROGRESS_TOTAL_ODDS_MIN = 10.0f;
    public static final float DEFAULT_SELECTION_ODDS_MAX = Float.MAX_VALUE;
    public static final float DEFAULT_SELECTION_ODDS_MIN = 1.0f;
    public static final String ID_SELECT_ALL = "id_all";
    public static final float SEEK_BAR_PROGRESS_SELECTION_ODDS_MAX = 100.0f;
    public static final float SEEK_BAR_PROGRESS_SELECTION_ODDS_MIN = 1.0f;
    private static final Range<Float> defaultSelectionOddsBoundary;
    private static final Range<Float> defaultTotalOddsBoundary;
    private static final Range<Float> selectionOddsSeekBarProgressBoundary;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(100.0f);
        selectionOddsSeekBarProgressBoundary = new Range<>(fValueOf, fValueOf2);
        defaultSelectionOddsBoundary = new Range<>(fValueOf, Float.valueOf(Float.MAX_VALUE));
        defaultTotalOddsBoundary = new Range<>(Float.valueOf(10.0f), fValueOf2);
    }

    public static final Range<Float> getDefaultSelectionOddsBoundary() {
        return defaultSelectionOddsBoundary;
    }

    public static final Range<Float> getDefaultTotalOddsBoundary() {
        return defaultTotalOddsBoundary;
    }

    public static final Range<Float> getSelectionOddsSeekBarProgressBoundary() {
        return selectionOddsSeekBarProgressBoundary;
    }
}
