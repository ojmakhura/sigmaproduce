// Generated by andromda-angular cartridge (app\usecase\state.store.ts.vsl) DO NOT EDIT
import { FarmListVO } from '@app/model/bw/co/sigmaproduce/farm/farm-list-vo';
import { FarmVO } from '@app/model/bw/co/sigmaproduce/farm/farm-vo';
import { CultivationVO } from '@app/model/bw/co/sigmaproduce/farm/cultivation/cultivation-vo';
import { FarmCriteria } from '@app/model/bw/co/sigmaproduce/farm/farm-criteria';

export const cropTypeKey = "cropType";

export interface CropTypeState {
    cultivation: CultivationVO | any;
    farms: Array<FarmListVO> | any[];
    criteria: FarmCriteria | any;
    id: string | any;
    loading: boolean;
    success: boolean;
    error: boolean;
    messages: string[];
}

export const initialState: CropTypeState = {
    cultivation: null,
    farms: [],
    criteria: null,
    id: null,
    loading: false,
    success: false,
    error: false,
    messages: []
};