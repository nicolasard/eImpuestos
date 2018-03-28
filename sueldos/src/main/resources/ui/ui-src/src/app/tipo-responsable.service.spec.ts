import { TestBed, inject } from '@angular/core/testing';

import { TipoResponsableService } from './tipo-responsable.service';

describe('TipoResponsableService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TipoResponsableService]
    });
  });

  it('should be created', inject([TipoResponsableService], (service: TipoResponsableService) => {
    expect(service).toBeTruthy();
  }));
});
