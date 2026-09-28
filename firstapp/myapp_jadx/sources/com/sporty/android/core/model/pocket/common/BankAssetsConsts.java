package com.sporty.android.core.model.pocket.common;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/BankAssetsConsts;", "", "<init>", "()V", "AssetType", "BankAssetAction", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BankAssetsConsts {
    public static final BankAssetsConsts INSTANCE = new BankAssetsConsts();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000Ê\u0001\u000e\b\u0004\u0012\n\b\u0005\u0012\u0006\b\n0\u00068\u0007¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/BankAssetsConsts$AssetType;", "", "Companion", "model", "Lkotlin/annotation/Retention;", "value", "Lkotlin/annotation/AnnotationRetention;", "SOURCE"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface AssetType {
        public static final int ACCOUNT = 2;
        public static final int BILLER = 3;
        public static final int CARD = 1;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int MOBILE = 4;
        public static final int PERSONAL = 5;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/BankAssetsConsts$AssetType$Companion;", "", "<init>", "()V", "CARD", "", "ACCOUNT", "BILLER", "MOBILE", "PERSONAL", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ACCOUNT = 2;
            public static final int BILLER = 3;
            public static final int CARD = 1;
            public static final int MOBILE = 4;
            public static final int PERSONAL = 5;

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000Ê\u0001\u000e\b\u0004\u0012\n\b\u0005\u0012\u0006\b\n0\u00068\u0007¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/BankAssetsConsts$BankAssetAction;", "", "Companion", "model", "Lkotlin/annotation/Retention;", "value", "Lkotlin/annotation/AnnotationRetention;", "SOURCE"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface BankAssetAction {
        public static final int ALL = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int DEPOSIT = 1;
        public static final int NONE = -1;
        public static final int WITHDRAW = 2;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/BankAssetsConsts$BankAssetAction$Companion;", "", "<init>", "()V", "NONE", "", "ALL", "DEPOSIT", "WITHDRAW", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ALL = 0;
            public static final int DEPOSIT = 1;
            public static final int NONE = -1;
            public static final int WITHDRAW = 2;

            private Companion() {
            }
        }
    }

    private BankAssetsConsts() {
    }
}
