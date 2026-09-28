package com.sportygames.compose.lobbyv2.models;

import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.w9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/LobbyV2SearchResultsModel;", "", "data", "", "Lcom/sportygames/compose/lobbyv2/models/LobbyV2GameDetailsModel;", "suggestions", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getSuggestions", "setSuggestions", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LobbyV2SearchResultsModel {
    public static final int $stable = 8;
    private List<LobbyV2GameDetailsModel> data;
    private List<LobbyV2GameDetailsModel> suggestions;

    public LobbyV2SearchResultsModel(List<LobbyV2GameDetailsModel> list, List<LobbyV2GameDetailsModel> list2) {
        this.data = list;
        this.suggestions = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LobbyV2SearchResultsModel copy$default(LobbyV2SearchResultsModel lobbyV2SearchResultsModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lobbyV2SearchResultsModel.data;
        }
        if ((i & 2) != 0) {
            list2 = lobbyV2SearchResultsModel.suggestions;
        }
        return lobbyV2SearchResultsModel.copy(list, list2);
    }

    public final List<LobbyV2GameDetailsModel> component1() {
        return this.data;
    }

    public final List<LobbyV2GameDetailsModel> component2() {
        return this.suggestions;
    }

    public final LobbyV2SearchResultsModel copy(List<LobbyV2GameDetailsModel> data, List<LobbyV2GameDetailsModel> suggestions) {
        return new LobbyV2SearchResultsModel(data, suggestions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LobbyV2SearchResultsModel)) {
            return false;
        }
        LobbyV2SearchResultsModel lobbyV2SearchResultsModel = (LobbyV2SearchResultsModel) other;
        return Intrinsics.g(this.data, lobbyV2SearchResultsModel.data) && Intrinsics.g(this.suggestions, lobbyV2SearchResultsModel.suggestions);
    }

    public final List<LobbyV2GameDetailsModel> getData() {
        return this.data;
    }

    public final List<LobbyV2GameDetailsModel> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        List<LobbyV2GameDetailsModel> list = this.data;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<LobbyV2GameDetailsModel> list2 = this.suggestions;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setData(List<LobbyV2GameDetailsModel> list) {
        this.data = list;
    }

    public final void setSuggestions(List<LobbyV2GameDetailsModel> list) {
        this.suggestions = list;
    }

    public String toString() {
        return w9d.a(OdQr.fNUQTYJw, ", suggestions=", ")", this.data, this.suggestions);
    }
}
