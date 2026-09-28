package com.sportygames.commons.models;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\b\u0017\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b\r\u0010%R$\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010+\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u00104R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010$\u001a\u0004\b\u0012\u0010%\"\u0004\b5\u00106R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/sportygames/commons/models/LeftMenuButton;", "", "", "popup", "", "name", AnalyticsParam.HOME_NAV_ICON, "Lcom/sportygames/commons/models/MenuIconSize;", "iconSize", "Lkotlin/Function0;", "", "onClick", "", "isToggle", "toggleState", "toggleOnColor", "toggleOffColor", "subtitle", "isLoading", "Lkotlin/Function1;", "onStateChange", "<init>", "(ILjava/lang/String;ILcom/sportygames/commons/models/MenuIconSize;Lkotlin/jvm/functions/Function0;ZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "I", "getPopup", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getIcon", "Lcom/sportygames/commons/models/MenuIconSize;", "getIconSize", "()Lcom/sportygames/commons/models/MenuIconSize;", "Lkotlin/jvm/functions/Function0;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "Z", "()Z", "Ljava/lang/Boolean;", "getToggleState", "()Ljava/lang/Boolean;", "setToggleState", "(Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "getToggleOnColor", "()Ljava/lang/Integer;", "setToggleOnColor", "(Ljava/lang/Integer;)V", "getToggleOffColor", "setToggleOffColor", "getSubtitle", "setSubtitle", "(Ljava/lang/String;)V", "setLoading", "(Z)V", "Lkotlin/jvm/functions/Function1;", "getOnStateChange", "()Lkotlin/jvm/functions/Function1;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class LeftMenuButton {
    public static final int $stable = 8;
    private final int icon;
    private final MenuIconSize iconSize;
    private boolean isLoading;
    private final boolean isToggle;
    private final String name;
    private final Function0<Unit> onClick;
    private final Function1<Boolean, Unit> onStateChange;
    private final int popup;
    private String subtitle;
    private Integer toggleOffColor;
    private Integer toggleOnColor;
    private Boolean toggleState;

    public /* synthetic */ LeftMenuButton(int i, String str, int i2, MenuIconSize menuIconSize, Function0 function0, boolean z, Boolean bool, Integer num, Integer num2, String str2, boolean z2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, menuIconSize, function0, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? null : bool, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? null : num2, (i3 & 512) != 0 ? null : str2, (i3 & 1024) != 0 ? false : z2, (i3 & 2048) != 0 ? null : function1);
    }

    public final int getIcon() {
        return this.icon;
    }

    public final MenuIconSize getIconSize() {
        return this.iconSize;
    }

    public final String getName() {
        return this.name;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final Function1<Boolean, Unit> getOnStateChange() {
        return this.onStateChange;
    }

    public final int getPopup() {
        return this.popup;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Integer getToggleOffColor() {
        return this.toggleOffColor;
    }

    public final Integer getToggleOnColor() {
        return this.toggleOnColor;
    }

    public final Boolean getToggleState() {
        return this.toggleState;
    }

    /* JADX INFO: renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: isToggle, reason: from getter */
    public final boolean getIsToggle() {
        return this.isToggle;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setToggleOffColor(Integer num) {
        this.toggleOffColor = num;
    }

    public final void setToggleOnColor(Integer num) {
        this.toggleOnColor = num;
    }

    public final void setToggleState(Boolean bool) {
        this.toggleState = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LeftMenuButton(int i, String str, int i2, MenuIconSize menuIconSize, Function0<Unit> function0, boolean z, Boolean bool, Integer num, Integer num2, String str2, boolean z2, Function1<? super Boolean, Unit> function1) {
        menuIconSize.getClass();
        function0.getClass();
        this.popup = i;
        this.name = str;
        this.icon = i2;
        this.iconSize = menuIconSize;
        this.onClick = function0;
        this.isToggle = z;
        this.toggleState = bool;
        this.toggleOnColor = num;
        this.toggleOffColor = num2;
        this.subtitle = str2;
        this.isLoading = z2;
        this.onStateChange = function1;
    }
}
