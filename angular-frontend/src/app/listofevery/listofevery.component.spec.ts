import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListofeveryComponent } from './listofevery.component';

describe('ListofeveryComponent', () => {
  let component: ListofeveryComponent;
  let fixture: ComponentFixture<ListofeveryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListofeveryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListofeveryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
